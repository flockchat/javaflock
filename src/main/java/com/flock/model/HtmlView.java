

package com.flock.model;

import java.util.Objects;
import com.google.gson.Gson;

/**
 * HtmlView
 */
public class HtmlView {
  private String inline = null;

  private Integer width = null;

  private Integer height = null;

  public HtmlView inline(String inline) {
    this.inline = inline;
    return this;
  }

   /**
   * Get inline
   * @return inline
  **/
  public String getInline() {
    return inline;
  }

  public void setInline(String inline) {
    this.inline = inline;
  }

  public HtmlView width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public HtmlView height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlView htmlView = (HtmlView) o;
    return Objects.equals(this.inline, htmlView.inline) &&
        Objects.equals(this.width, htmlView.width) &&
        Objects.equals(this.height, htmlView.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inline, width, height);
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
    return gson.toJson(this, HtmlView.class);
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

