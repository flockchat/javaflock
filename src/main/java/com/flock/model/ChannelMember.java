

package com.flock.model;

import java.util.Objects;
import com.flock.model.PublicProfile;
import com.google.gson.Gson;

/**
 * ChannelMember
 */
public class ChannelMember {
  private String userId = null;

  private String affiliation = null;

  private PublicProfile publicProfile = null;

  public ChannelMember userId(String userId) {
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

  public ChannelMember affiliation(String affiliation) {
    this.affiliation = affiliation;
    return this;
  }

   /**
   * Get affiliation
   * @return affiliation
  **/
  public String getAffiliation() {
    return affiliation;
  }

  public void setAffiliation(String affiliation) {
    this.affiliation = affiliation;
  }

  public ChannelMember publicProfile(PublicProfile publicProfile) {
    this.publicProfile = publicProfile;
    return this;
  }

   /**
   * Get publicProfile
   * @return publicProfile
  **/
  public PublicProfile getPublicProfile() {
    return publicProfile;
  }

  public void setPublicProfile(PublicProfile publicProfile) {
    this.publicProfile = publicProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelMember channelMember = (ChannelMember) o;
    return Objects.equals(this.userId, channelMember.userId) &&
        Objects.equals(this.affiliation, channelMember.affiliation) &&
        Objects.equals(this.publicProfile, channelMember.publicProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, affiliation, publicProfile);
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
    return gson.toJson(this, ChannelMember.class);
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

