

package co.flock.model;

import java.util.Objects;
import co.flock.model.Event;
import co.flock.model.Message;
import com.google.gson.Gson;

/**
 * ChatReceiveMessage
 */
public class ChatReceiveMessage extends Event {
  private String userId = null;

  private Message message = null;

  public ChatReceiveMessage userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ChatReceiveMessage message(Message message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatReceiveMessage chatReceiveMessage = (ChatReceiveMessage) o;
    return Objects.equals(this.userId, chatReceiveMessage.userId) &&
        Objects.equals(this.message, chatReceiveMessage.message) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, message, super.hashCode());
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this, ChatReceiveMessage.class);
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

