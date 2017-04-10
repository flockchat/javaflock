

package co.flock.model;

import java.util.Objects;
import co.flock.model.Event;
import com.google.gson.Gson;

/**
 * ClientFlockmlAction
 */
public class ClientFlockmlAction extends Event {
  private String userName = null;

  private String chat = null;

  private String chatName = null;

  private String messageId = null;

  private String messageUid = null;

  private String attachmentId = null;

  private String actionId = null;

  public ClientFlockmlAction userName(String userName) {
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

  public ClientFlockmlAction chat(String chat) {
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

  public ClientFlockmlAction chatName(String chatName) {
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

  public ClientFlockmlAction messageId(String messageId) {
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

  public ClientFlockmlAction messageUid(String messageUid) {
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

  public ClientFlockmlAction attachmentId(String attachmentId) {
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

  public ClientFlockmlAction actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientFlockmlAction clientFlockmlAction = (ClientFlockmlAction) o;
    return Objects.equals(this.userName, clientFlockmlAction.userName) &&
        Objects.equals(this.chat, clientFlockmlAction.chat) &&
        Objects.equals(this.chatName, clientFlockmlAction.chatName) &&
        Objects.equals(this.messageId, clientFlockmlAction.messageId) &&
        Objects.equals(this.messageUid, clientFlockmlAction.messageUid) &&
        Objects.equals(this.attachmentId, clientFlockmlAction.attachmentId) &&
        Objects.equals(this.actionId, clientFlockmlAction.actionId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, chat, chatName, messageId, messageUid, attachmentId, actionId, super.hashCode());
  }


  /**
   * Converts the object to json string
   */
  @Override
  public String toString() {
    return toJsonString();
  }

  public String toJsonString() {
    Gson gson = new Gson();
    return gson.toJson(this, ClientFlockmlAction.class);
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

