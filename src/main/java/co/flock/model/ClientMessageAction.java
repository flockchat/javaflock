

package co.flock.model;

import java.util.Objects;
import co.flock.model.Event;
import co.flock.model.Message;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

/**
 * ClientMessageAction
 */
public class ClientMessageAction extends Event {
  private String userName = null;

  private String chat = null;

  private List<String> messageUids = new ArrayList<String>();

  private List<Message> messages = new ArrayList<Message>();

  public ClientMessageAction userName(String userName) {
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

  public ClientMessageAction chat(String chat) {
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

  public ClientMessageAction messageUids(List<String> messageUids) {
    this.messageUids = messageUids;
    return this;
  }

  public ClientMessageAction addMessageUidsItem(String messageUidsItem) {
    this.messageUids.add(messageUidsItem);
    return this;
  }

   /**
   * Get messageUids
   * @return messageUids
  **/
  public List<String> getMessageUids() {
    return messageUids;
  }

  public void setMessageUids(List<String> messageUids) {
    this.messageUids = messageUids;
  }

  public ClientMessageAction messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public ClientMessageAction addMessagesItem(Message messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientMessageAction clientMessageAction = (ClientMessageAction) o;
    return Objects.equals(this.userName, clientMessageAction.userName) &&
        Objects.equals(this.chat, clientMessageAction.chat) &&
        Objects.equals(this.messageUids, clientMessageAction.messageUids) &&
        Objects.equals(this.messages, clientMessageAction.messages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, chat, messageUids, messages, super.hashCode());
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
    return gson.toJson(this, ClientMessageAction.class);
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

