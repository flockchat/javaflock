

package co.flock.model;

import java.util.Objects;
import co.flock.model.Attachment;
import co.flock.model.SendAs;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

/**
 * Message
 */
public class Message {
  private String from = null;

  private String to = null;

  private String id = null;

  private String uid = null;

  private String timestamp = null;

  private String text = null;

  private String flockml = null;

  private String notification = null;

  private String appId = null;

  private List<String> mentions = new ArrayList<String>();

  private List<Attachment> attachments = new ArrayList<Attachment>();

  private SendAs sendAs = null;

  public Message from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Message to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Message id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Message uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public Message timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Message text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Message flockml(String flockml) {
    this.flockml = flockml;
    return this;
  }

   /**
   * Get flockml
   * @return flockml
  **/
  public String getFlockml() {
    return flockml;
  }

  public void setFlockml(String flockml) {
    this.flockml = flockml;
  }

  public Message notification(String notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public Message appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Message mentions(List<String> mentions) {
    this.mentions = mentions;
    return this;
  }

  public Message addMentionsItem(String mentionsItem) {
    this.mentions.add(mentionsItem);
    return this;
  }

   /**
   * Get mentions
   * @return mentions
  **/
  public List<String> getMentions() {
    return mentions;
  }

  public void setMentions(List<String> mentions) {
    this.mentions = mentions;
  }

  public Message attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Message addAttachmentsItem(Attachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public Message sendAs(SendAs sendAs) {
    this.sendAs = sendAs;
    return this;
  }

   /**
   * Get sendAs
   * @return sendAs
  **/
  public SendAs getSendAs() {
    return sendAs;
  }

  public void setSendAs(SendAs sendAs) {
    this.sendAs = sendAs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.from, message.from) &&
        Objects.equals(this.to, message.to) &&
        Objects.equals(this.id, message.id) &&
        Objects.equals(this.uid, message.uid) &&
        Objects.equals(this.timestamp, message.timestamp) &&
        Objects.equals(this.text, message.text) &&
        Objects.equals(this.flockml, message.flockml) &&
        Objects.equals(this.notification, message.notification) &&
        Objects.equals(this.appId, message.appId) &&
        Objects.equals(this.mentions, message.mentions) &&
        Objects.equals(this.attachments, message.attachments) &&
        Objects.equals(this.sendAs, message.sendAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, id, uid, timestamp, text, flockml, notification, appId, mentions, attachments, sendAs);
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this, Message.class);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

