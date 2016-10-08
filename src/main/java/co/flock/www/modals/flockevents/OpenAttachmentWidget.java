package co.flock.www.modals.flockevents;

/**
 * This event modal is generated when a Flock client opens an attachment widget. An attachment widget is either opened inline (on desktop) or in a modal webview (on mobile).
   This event modal is only ever sent to the URL of the attachment widget – it is never sent to the app service or to the browser.
 */
public class OpenAttachmentWidget extends FlockEvent {
    private String userName;
    private String chat;
    private String chatName;
    private String messageId;
    private String messageUid;
    private String attachmentId;

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

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageUid() {
        return messageUid;
    }

    public void setMessageUid(String messageUid) {
        this.messageUid = messageUid;
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
}
