package co.flock.model.event;

/**
 * This event modal is generated when your app's widget calls any of the following flock.js methods:
    sendToAppService
    openWidget
    openBrowser
 */
public class WidgetAction extends FlockEvent {
    private String userName;
    private String chat;
    private String chatName;
    private String messageUid;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getMessageUid() {
        return messageUid;
    }

    public void setMessageUid(String messageUid) {
        this.messageUid = messageUid;
    }
}
