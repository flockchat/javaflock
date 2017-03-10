

package co.flock.model;

import java.util.Objects;
import co.flock.model.Event;
import com.google.gson.Gson;

/**
 * ChatGenerateUrlPreview
 */
public class ChatGenerateUrlPreview extends Event {
  private String url = null;

  private String to = null;

  private String messageId = null;

  public ChatGenerateUrlPreview url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ChatGenerateUrlPreview to(String to) {
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

  public ChatGenerateUrlPreview messageId(String messageId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatGenerateUrlPreview chatGenerateUrlPreview = (ChatGenerateUrlPreview) o;
    return Objects.equals(this.url, chatGenerateUrlPreview.url) &&
        Objects.equals(this.to, chatGenerateUrlPreview.to) &&
        Objects.equals(this.messageId, chatGenerateUrlPreview.messageId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, to, messageId, super.hashCode());
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this, ChatGenerateUrlPreview.class);
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

