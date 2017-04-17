

package com.flock.model;

import java.util.Objects;
import com.google.gson.Gson;

/**
 * WidgetView
 */
public class WidgetView {
  private String src = null;

  private Integer width = null;

  private Integer height = null;

  public WidgetView src(String src) {
    this.src = src;
    return this;
  }

   /**
   * Get src
   * @return src
  **/
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public WidgetView width(Integer width) {
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

  public WidgetView height(Integer height) {
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
    WidgetView widgetView = (WidgetView) o;
    return Objects.equals(this.src, widgetView.src) &&
        Objects.equals(this.width, widgetView.width) &&
        Objects.equals(this.height, widgetView.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, width, height);
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
    return gson.toJson(this, WidgetView.class);
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

