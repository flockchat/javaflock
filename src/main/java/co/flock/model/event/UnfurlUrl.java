package co.flock.model.event;

/**
 * This event modal is sent to the app service by Flock to request the app to unfurl a list of URLs.
 */
public class UnfurlUrl extends FlockEvent {
    private String chat;
    private String messageId;
    private String url;

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
