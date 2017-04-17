package com.flock;

import com.flock.model.AppInstall;
import com.flock.model.AppUninstall;
import com.flock.model.ChatGenerateUrlPreview;
import com.flock.model.Attachment;
import com.flock.model.ChatReceiveMessage;
import com.flock.model.ClientFlockmlAction;
import com.flock.model.ClientMessageAction;
import com.flock.model.ClientOpenAttachmentWidget;
import com.flock.model.ClientPressButton;
import com.flock.model.ToastMessage;
import com.flock.model.ClientSlashCommand;
import com.flock.model.ToastMessage;
import com.flock.model.ClientWidgetAction;
import com.flock.event.EventListener;
import com.flock.event.EventListenerWithResponse;
import com.flock.event.UnhandledEventException;
import com.flock.model.Event;
import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.PrintWriter;

public class EventHandlerClient {
    private static final Logger logger = LoggerFactory.getLogger(EventHandlerClient.class);
    private final Gson _gson;
    private final TokenVerifier _tokenVerifier;
    private EventListener<AppInstall> appInstallEventListener;
    private EventListener<AppUninstall> appUninstallEventListener;
    private EventListenerWithResponse<ChatGenerateUrlPreview, Attachment> chatGenerateUrlPreviewEventListener;
    private EventListener<ChatReceiveMessage> chatReceiveMessageEventListener;
    private EventListener<ClientFlockmlAction> clientFlockmlActionEventListener;
    private EventListener<ClientMessageAction> clientMessageActionEventListener;
    private EventListener<ClientOpenAttachmentWidget> clientOpenAttachmentWidgetEventListener;
    private EventListenerWithResponse<ClientPressButton, ToastMessage> clientPressButtonEventListener;
    private EventListenerWithResponse<ClientSlashCommand, ToastMessage> clientSlashCommandEventListener;
    private EventListener<ClientWidgetAction> clientWidgetActionEventListener;

    public EventHandlerClient(String appId, String appSecret) throws UnsupportedEncodingException {
        _tokenVerifier = new TokenVerifier(appId, appSecret);
        _gson = new Gson();
    }

    public HttpServletResponse handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String body = getMessagebody(request.getReader());
        logger.debug("request body is " + body);
        Event flockEvent = _gson.fromJson(body, Event.class);
        Preconditions.checkNotNull(flockEvent, "Unable to parse event");

        String flockValidationToken = request.getHeader("X-Flock-Event-Token");
        if(!_tokenVerifier.verifyToken(flockValidationToken, flockEvent.getUserId())) {
            throw new TokenVerifier.TokenVerificationException();
        }
        String responseBody = null;
        switch (flockEvent.getName()) {
            case "app.install" : {
                logger.debug("in app.install" );
                if (appInstallEventListener == null) {
                    throw new UnhandledEventException("app.install");
                }
                AppInstall appInstall = _gson.fromJson(body,AppInstall.class);
                appInstallEventListener.handle(appInstall);
                break;
            }
            case "app.uninstall" : {
                logger.debug("in app.uninstall" );
                if (appUninstallEventListener == null) {
                    throw new UnhandledEventException("app.uninstall");
                }
                AppUninstall appUninstall = _gson.fromJson(body,AppUninstall.class);
                appUninstallEventListener.handle(appUninstall);
                break;
            }
            case "chat.generateUrlPreview" : {
                logger.debug("in chat.generateUrlPreview" );
                if (chatGenerateUrlPreviewEventListener == null) {
                    throw new UnhandledEventException("chat.generateUrlPreview");
                }
                ChatGenerateUrlPreview chatGenerateUrlPreview = _gson.fromJson(body,ChatGenerateUrlPreview.class);
                responseBody = chatGenerateUrlPreviewEventListener.handle(chatGenerateUrlPreview).toString();
                break;
            }
            case "chat.receiveMessage" : {
                logger.debug("in chat.receiveMessage" );
                if (chatReceiveMessageEventListener == null) {
                    throw new UnhandledEventException("chat.receiveMessage");
                }
                ChatReceiveMessage chatReceiveMessage = _gson.fromJson(body,ChatReceiveMessage.class);
                chatReceiveMessageEventListener.handle(chatReceiveMessage);
                break;
            }
            case "client.flockmlAction" : {
                logger.debug("in client.flockmlAction" );
                if (clientFlockmlActionEventListener == null) {
                    throw new UnhandledEventException("client.flockmlAction");
                }
                ClientFlockmlAction clientFlockmlAction = _gson.fromJson(body,ClientFlockmlAction.class);
                clientFlockmlActionEventListener.handle(clientFlockmlAction);
                break;
            }
            case "client.messageAction" : {
                logger.debug("in client.messageAction" );
                if (clientMessageActionEventListener == null) {
                    throw new UnhandledEventException("client.messageAction");
                }
                ClientMessageAction clientMessageAction = _gson.fromJson(body,ClientMessageAction.class);
                clientMessageActionEventListener.handle(clientMessageAction);
                break;
            }
            case "client.openAttachmentWidget" : {
                logger.debug("in client.openAttachmentWidget" );
                if (clientOpenAttachmentWidgetEventListener == null) {
                    throw new UnhandledEventException("client.openAttachmentWidget");
                }
                ClientOpenAttachmentWidget clientOpenAttachmentWidget = _gson.fromJson(body,ClientOpenAttachmentWidget.class);
                clientOpenAttachmentWidgetEventListener.handle(clientOpenAttachmentWidget);
                break;
            }
            case "client.pressButton" : {
                logger.debug("in client.pressButton" );
                if (clientPressButtonEventListener == null) {
                    throw new UnhandledEventException("client.pressButton");
                }
                ClientPressButton clientPressButton = _gson.fromJson(body,ClientPressButton.class);
                responseBody = clientPressButtonEventListener.handle(clientPressButton).toString();
                break;
            }
            case "client.slashCommand" : {
                logger.debug("in client.slashCommand" );
                if (clientSlashCommandEventListener == null) {
                    throw new UnhandledEventException("client.slashCommand");
                }
                ClientSlashCommand clientSlashCommand = _gson.fromJson(body,ClientSlashCommand.class);
                responseBody = clientSlashCommandEventListener.handle(clientSlashCommand).toString();
                break;
            }
            case "client.widgetAction" : {
                logger.debug("in client.widgetAction" );
                if (clientWidgetActionEventListener == null) {
                    throw new UnhandledEventException("client.widgetAction");
                }
                ClientWidgetAction clientWidgetAction = _gson.fromJson(body,ClientWidgetAction.class);
                clientWidgetActionEventListener.handle(clientWidgetAction);
                break;
            }
            default: {
                throw new Exception("Unknown event encountered " + flockEvent.getName());
            }
        }
        if(responseBody!= null) {
            PrintWriter writer = response.getWriter();
            writer.write(responseBody);
            writer.flush();
            writer.close();
        }
        response.setStatus(HttpServletResponse.SC_OK);
        return response;
    }

    public void setAppInstallListener (EventListener<AppInstall> appInstallEventListener) {
        this.appInstallEventListener = appInstallEventListener;
    }

    public void setAppUninstallListener (EventListener<AppUninstall> appUninstallEventListener) {
        this.appUninstallEventListener = appUninstallEventListener;
    }

    public void setChatGenerateUrlPreviewListener (EventListenerWithResponse<ChatGenerateUrlPreview, Attachment> chatGenerateUrlPreviewEventListener) {
        this.chatGenerateUrlPreviewEventListener = chatGenerateUrlPreviewEventListener;
    }

    public void setChatReceiveMessageListener (EventListener<ChatReceiveMessage> chatReceiveMessageEventListener) {
        this.chatReceiveMessageEventListener = chatReceiveMessageEventListener;
    }

    public void setClientFlockmlActionListener (EventListener<ClientFlockmlAction> clientFlockmlActionEventListener) {
        this.clientFlockmlActionEventListener = clientFlockmlActionEventListener;
    }

    public void setClientMessageActionListener (EventListener<ClientMessageAction> clientMessageActionEventListener) {
        this.clientMessageActionEventListener = clientMessageActionEventListener;
    }

    public void setClientOpenAttachmentWidgetListener (EventListener<ClientOpenAttachmentWidget> clientOpenAttachmentWidgetEventListener) {
        this.clientOpenAttachmentWidgetEventListener = clientOpenAttachmentWidgetEventListener;
    }

    public void setClientPressButtonListener (EventListenerWithResponse<ClientPressButton, ToastMessage> clientPressButtonEventListener) {
        this.clientPressButtonEventListener = clientPressButtonEventListener;
    }

    public void setClientSlashCommandListener (EventListenerWithResponse<ClientSlashCommand, ToastMessage> clientSlashCommandEventListener) {
        this.clientSlashCommandEventListener = clientSlashCommandEventListener;
    }

    public void setClientWidgetActionListener (EventListener<ClientWidgetAction> clientWidgetActionEventListener) {
        this.clientWidgetActionEventListener = clientWidgetActionEventListener;
    }

    private static String getMessagebody(BufferedReader reader) throws IOException {
        String body = "";
        String line;
        while ((line = reader.readLine()) != null) {
            body = body + line;
        }
        return body;
    }
}
