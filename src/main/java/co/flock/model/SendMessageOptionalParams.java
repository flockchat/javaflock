package co.flock.model;

import co.flock.model.Error;
import co.flock.model.UidResponse;
import co.flock.model.Attachment;
import co.flock.model.SendAs;
import java.util.*;


public class SendMessageOptionalParams {

    private String flockml = null;
    private String notification = null;
    private List<String> mentions = null;
    private SendAs sendAs = null;
    private List<Attachment> attachments = null;

    public SendMessageOptionalParams flockml(String flockml) {
        this.flockml = flockml;
        return this;
    }

    public String getFlockml() {
        return flockml;
    }

    public void setFlockml(String flockml) {
        this.flockml = flockml;
    }
    public SendMessageOptionalParams notification(String notification) {
        this.notification = notification;
        return this;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }
    public SendMessageOptionalParams mentions(List<String> mentions) {
        this.mentions = mentions;
        return this;
    }

    public List<String> getMentions() {
        return mentions;
    }

    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }
    public SendMessageOptionalParams sendAs(SendAs sendAs) {
        this.sendAs = sendAs;
        return this;
    }

    public SendAs getSendAs() {
        return sendAs;
    }

    public void setSendAs(SendAs sendAs) {
        this.sendAs = sendAs;
    }
    public SendMessageOptionalParams attachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}