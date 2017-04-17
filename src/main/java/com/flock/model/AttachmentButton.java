

package com.flock.model;

import java.util.Objects;
import com.flock.model.ActionConfig;
import com.google.gson.Gson;

/**
 * AttachmentButton
 */
public class AttachmentButton {
  private String name = null;

  private String icon = null;

  private ActionConfig action = null;

  private String id = null;

  public AttachmentButton name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentButton icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public AttachmentButton action(ActionConfig action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  public ActionConfig getAction() {
    return action;
  }

  public void setAction(ActionConfig action) {
    this.action = action;
  }

  public AttachmentButton id(String id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentButton attachmentButton = (AttachmentButton) o;
    return Objects.equals(this.name, attachmentButton.name) &&
        Objects.equals(this.icon, attachmentButton.icon) &&
        Objects.equals(this.action, attachmentButton.action) &&
        Objects.equals(this.id, attachmentButton.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, icon, action, id);
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
    return gson.toJson(this, AttachmentButton.class);
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

