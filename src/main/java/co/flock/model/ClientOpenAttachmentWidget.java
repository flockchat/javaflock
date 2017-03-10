

package co.flock.model;

import java.util.Objects;
import co.flock.model.Event;
import com.google.gson.Gson;

/**
 * ClientOpenAttachmentWidget
 */
public class ClientOpenAttachmentWidget extends Event {
  private String userName = null;

  private String chat = null;

  private String chatName = null;

  private String messageId = null;

  private String messageUid = null;

  private String attachmentId = null;

  public ClientOpenAttachmentWidget userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ClientOpenAttachmentWidget chat(String chat) {
    this.chat = chat;
    return this;
  }

   /**
   * Get chat
   * @return chat
  **/
  public String getChat() {
    return chat;
  }

  public void setChat(String chat) {
    this.chat = chat;
  }

  public ClientOpenAttachmentWidget chatName(String chatName) {
    this.chatName = chatName;
    return this;
  }

   /**
   * Get chatName
   * @return chatName
  **/
  public String getChatName() {
    return chatName;
  }

  public void setChatName(String chatName) {
    this.chatName = chatName;
  }

  public ClientOpenAttachmentWidget messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public ClientOpenAttachmentWidget messageUid(String messageUid) {
    this.messageUid = messageUid;
    return this;
  }

   /**
   * Get messageUid
   * @return messageUid
  **/
  public String getMessageUid() {
    return messageUid;
  }

  public void setMessageUid(String messageUid) {
    this.messageUid = messageUid;
  }

  public ClientOpenAttachmentWidget attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * Get attachmentId
   * @return attachmentId
  **/
  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientOpenAttachmentWidget clientOpenAttachmentWidget = (ClientOpenAttachmentWidget) o;
    return Objects.equals(this.userName, clientOpenAttachmentWidget.userName) &&
        Objects.equals(this.chat, clientOpenAttachmentWidget.chat) &&
        Objects.equals(this.chatName, clientOpenAttachmentWidget.chatName) &&
        Objects.equals(this.messageId, clientOpenAttachmentWidget.messageId) &&
        Objects.equals(this.messageUid, clientOpenAttachmentWidget.messageUid) &&
        Objects.equals(this.attachmentId, clientOpenAttachmentWidget.attachmentId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, chat, chatName, messageId, messageUid, attachmentId, super.hashCode());
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this, ClientOpenAttachmentWidget.class);
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

