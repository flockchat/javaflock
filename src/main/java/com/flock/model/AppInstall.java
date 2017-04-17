

package com.flock.model;

import java.util.Objects;
import com.flock.model.Event;
import com.google.gson.Gson;

/**
 * AppInstall
 */
public class AppInstall extends Event {
  private String token = null;

  public AppInstall token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInstall appInstall = (AppInstall) o;
    return Objects.equals(this.token, appInstall.token) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, super.hashCode());
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
    return gson.toJson(this, AppInstall.class);
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

