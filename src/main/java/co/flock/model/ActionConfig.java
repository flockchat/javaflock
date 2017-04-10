

package co.flock.model;

import java.util.Objects;
import com.google.gson.Gson;

/**
 * ActionConfig
 */
public class ActionConfig {
  private String type = null;

  private String url = null;

  private String desktopType = null;

  private String mobileType = null;

  private Boolean sendContext = null;

  public ActionConfig type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ActionConfig url(String url) {
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

  public ActionConfig desktopType(String desktopType) {
    this.desktopType = desktopType;
    return this;
  }

   /**
   * Get desktopType
   * @return desktopType
  **/
  public String getDesktopType() {
    return desktopType;
  }

  public void setDesktopType(String desktopType) {
    this.desktopType = desktopType;
  }

  public ActionConfig mobileType(String mobileType) {
    this.mobileType = mobileType;
    return this;
  }

   /**
   * Get mobileType
   * @return mobileType
  **/
  public String getMobileType() {
    return mobileType;
  }

  public void setMobileType(String mobileType) {
    this.mobileType = mobileType;
  }

  public ActionConfig sendContext(Boolean sendContext) {
    this.sendContext = sendContext;
    return this;
  }

   /**
   * Get sendContext
   * @return sendContext
  **/
  public Boolean getSendContext() {
    return sendContext;
  }

  public void setSendContext(Boolean sendContext) {
    this.sendContext = sendContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionConfig actionConfig = (ActionConfig) o;
    return Objects.equals(this.type, actionConfig.type) &&
        Objects.equals(this.url, actionConfig.url) &&
        Objects.equals(this.desktopType, actionConfig.desktopType) &&
        Objects.equals(this.mobileType, actionConfig.mobileType) &&
        Objects.equals(this.sendContext, actionConfig.sendContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, desktopType, mobileType, sendContext);
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
    return gson.toJson(this, ActionConfig.class);
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

