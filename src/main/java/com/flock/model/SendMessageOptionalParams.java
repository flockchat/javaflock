package com.flock.model;

import com.flock.model.Error;
import com.flock.model.UidResponse;
import com.flock.model.Attachment;
import com.flock.model.SendAs;
import java.util.*;


public class SendMessageOptionalParams {

    private String onBehalfOf = null;
    private List<String> visibleTo = null;
    private String flockml = null;
    private String notification = null;
    private List<String> mentions = null;
    private SendAs sendAs = null;
    private List<Attachment> attachments = null;

    public SendMessageOptionalParams onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public String getOnBehalfOf() {
        return onBehalfOf;
    }

    public void setOnBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }
    public SendMessageOptionalParams visibleTo(List<String> visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    public List<String> getVisibleTo() {
        return visibleTo;
    }

    public void setVisibleTo(List<String> visibleTo) {
        this.visibleTo = visibleTo;
    }
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