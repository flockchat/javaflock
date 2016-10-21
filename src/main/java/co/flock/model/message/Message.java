package co.flock.model.message;

import co.flock.model.message.attachments.Attachment;

/**
 * Created by devesh.k on 08/07/16.
 */
public class Message {
    private String from;
    private String to;
    private String text;
    private String id;
    private String uid;
    private Attachment[] attachments;
    private String timestamp;
    private SendAs sendAs;
    private String flockml;
    private String notification;
    private String appId;
    private String[] mentions;
    public Message(String to , String text){
        this.setTo(to);
        this.setText(text);
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getText() {
        return text;
    }

    public Attachment[] getAttachments() {
        return attachments;
    }

    public String getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setAttachments(Attachment[] attachments) {
        this.attachments = attachments;
    }

    public SendAs getSendAs() {
        return sendAs;
    }

    public void setSendAs(SendAs sendAs) {
        this.sendAs = sendAs;
    }

    public String getFlockml() {
        return flockml;
    }

    public void setFlockml(String flockml) {
        this.flockml = flockml;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String[] getMentions() {
        return mentions;
    }

    public void setMentions(String[] mentions) {
        this.mentions = mentions;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
