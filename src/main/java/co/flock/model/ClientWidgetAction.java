

package co.flock.model;

import java.util.Objects;
import co.flock.model.Event;
import com.google.gson.Gson;

/**
 * ClientWidgetAction
 */
public class ClientWidgetAction extends Event {
  private String userName = null;

  private String chat = null;

  private String chatName = null;

  private String messageUid = null;

  private String attachmentId = null;

  public ClientWidgetAction userName(String userName) {
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

  public ClientWidgetAction chat(String chat) {
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

  public ClientWidgetAction chatName(String chatName) {
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

  public ClientWidgetAction messageUid(String messageUid) {
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

  public ClientWidgetAction attachmentId(String attachmentId) {
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
    ClientWidgetAction clientWidgetAction = (ClientWidgetAction) o;
    return Objects.equals(this.userName, clientWidgetAction.userName) &&
        Objects.equals(this.chat, clientWidgetAction.chat) &&
        Objects.equals(this.chatName, clientWidgetAction.chatName) &&
        Objects.equals(this.messageUid, clientWidgetAction.messageUid) &&
        Objects.equals(this.attachmentId, clientWidgetAction.attachmentId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, chat, chatName, messageUid, attachmentId, super.hashCode());
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this, ClientWidgetAction.class);
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

