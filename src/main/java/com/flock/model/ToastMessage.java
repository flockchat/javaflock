

package com.flock.model;

import java.util.Objects;
import com.google.gson.Gson;

/**
 * ToastMessage
 */
public class ToastMessage {
  private String text = null;

  public ToastMessage text(String text) {
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
    ToastMessage toastMessage = (ToastMessage) o;
    return Objects.equals(this.text, toastMessage.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
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
    return gson.toJson(this, ToastMessage.class);
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

