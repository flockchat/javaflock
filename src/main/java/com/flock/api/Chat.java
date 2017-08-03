

package com.flock.api;

import com.flock.model.Message;
import com.flock.model.Error;
import com.flock.model.SendMessageOptionalParams;
import com.flock.model.UidResponse;
import com.flock.model.Attachment;
import com.flock.model.SendAs;

import com.google.common.util.concurrent.ListenableFuture;
import static com.flock.api.ApiUtils.*;
import static com.flock.api.FlockApiClient.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Chat {

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @param chat  (required) 
     * @param uids  (required) 
     * @return ListenableFuture<Message[]>
     */
    public static ListenableFuture<Message[]> fetchMessagesAsync(String token, String chat, List<String> uids) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        putParam(params, "chat", chat);
        putParam(params, "uids", uids);
        return sendRequest(post(FLOCK_BASE_URL + "/chat.fetchMessages").headers(getDefaultHeaders()).fields(params), Message[].class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @param chat  (required) 
     * @param uids  (required) 
     * @return Message[]
     */
    public static Message[] fetchMessages(String token, String chat, List<String> uids) throws Exception {
        return fetchMessagesAsync(token, chat, uids).get();
    }

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @param to  (required) 
     * @param text  (required) 
     * @param sendMessageOptionalParams (optional)
     * @return ListenableFuture<UidResponse>
     */
    public static ListenableFuture<UidResponse> sendMessageAsync(String token, String to, String text, SendMessageOptionalParams sendMessageOptionalParams) {
        if(sendMessageOptionalParams == null) {
            sendMessageOptionalParams = new SendMessageOptionalParams();
        }
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        putParam(params, "to", to);
        putParam(params, "text", text);
        putParam(params, "onBehalfOf", sendMessageOptionalParams.getOnBehalfOf());
        putParam(params, "visibleTo", sendMessageOptionalParams.getVisibleTo());
        putParam(params, "flockml", sendMessageOptionalParams.getFlockml());
        putParam(params, "notification", sendMessageOptionalParams.getNotification());
        putParam(params, "mentions", sendMessageOptionalParams.getMentions());
        putParam(params, "sendAs", sendMessageOptionalParams.getSendAs());
        putParam(params, "attachments", sendMessageOptionalParams.getAttachments());
        return sendRequest(post(FLOCK_BASE_URL + "/chat.sendMessage").headers(getDefaultHeaders()).fields(params), UidResponse.class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @param to  (required) 
     * @param text  (required) 
     * @param sendMessageOptionalParams (optional)
     * @return UidResponse
     */
    public static UidResponse sendMessage(String token, String to, String text, SendMessageOptionalParams sendMessageOptionalParams) throws Exception {
        return sendMessageAsync(token, to, text, sendMessageOptionalParams).get();
    }
}
