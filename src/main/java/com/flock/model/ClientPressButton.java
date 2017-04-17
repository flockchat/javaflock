

package com.flock.model;

import java.util.Objects;
import com.flock.model.Event;
import com.google.gson.Gson;

/**
 * ClientPressButton
 */
public class ClientPressButton extends Event {
  private String button = null;

  private String userName = null;

  private String chat = null;

  private String chatName = null;

  private String messageUid = null;

  private String attachmentId = null;

  private String buttonId = null;

  public ClientPressButton button(String button) {
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  public String getButton() {
    return button;
  }

  public void setButton(String button) {
    this.button = button;
  }

  public ClientPressButton userName(String userName) {
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

  public ClientPressButton chat(String chat) {
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

  public ClientPressButton chatName(String chatName) {
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

  public ClientPressButton messageUid(String messageUid) {
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

  public ClientPressButton attachmentId(String attachmentId) {
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

  public ClientPressButton buttonId(String buttonId) {
    this.buttonId = buttonId;
    return this;
  }

   /**
   * Get buttonId
   * @return buttonId
  **/
  public String getButtonId() {
    return buttonId;
  }

  public void setButtonId(String buttonId) {
    this.buttonId = buttonId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientPressButton clientPressButton = (ClientPressButton) o;
    return Objects.equals(this.button, clientPressButton.button) &&
        Objects.equals(this.userName, clientPressButton.userName) &&
        Objects.equals(this.chat, clientPressButton.chat) &&
        Objects.equals(this.chatName, clientPressButton.chatName) &&
        Objects.equals(this.messageUid, clientPressButton.messageUid) &&
        Objects.equals(this.attachmentId, clientPressButton.attachmentId) &&
        Objects.equals(this.buttonId, clientPressButton.buttonId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(button, userName, chat, chatName, messageUid, attachmentId, buttonId, super.hashCode());
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
    return gson.toJson(this, ClientPressButton.class);
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

