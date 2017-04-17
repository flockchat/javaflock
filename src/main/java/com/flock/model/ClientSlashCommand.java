

package com.flock.model;

import java.util.Objects;
import com.flock.model.Event;
import com.google.gson.Gson;

/**
 * ClientSlashCommand
 */
public class ClientSlashCommand extends Event {
  private String userName = null;

  private String chat = null;

  private String chatName = null;

  private String command = null;

  private String text = null;

  public ClientSlashCommand userName(String userName) {
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

  public ClientSlashCommand chat(String chat) {
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

  public ClientSlashCommand chatName(String chatName) {
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

  public ClientSlashCommand command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public ClientSlashCommand text(String text) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSlashCommand clientSlashCommand = (ClientSlashCommand) o;
    return Objects.equals(this.userName, clientSlashCommand.userName) &&
        Objects.equals(this.chat, clientSlashCommand.chat) &&
        Objects.equals(this.chatName, clientSlashCommand.chatName) &&
        Objects.equals(this.command, clientSlashCommand.command) &&
        Objects.equals(this.text, clientSlashCommand.text) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, chat, chatName, command, text, super.hashCode());
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
    return gson.toJson(this, ClientSlashCommand.class);
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

