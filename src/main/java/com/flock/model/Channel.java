

package com.flock.model;

import java.util.Objects;
import com.google.gson.Gson;

/**
 * Channel
 */
public class Channel {
  private String id = null;

  private String name = null;

  private Integer memberCount = null;

  private String profileImage = null;

  private String purpose = null;

  public Channel id(String id) {
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

  public Channel name(String name) {
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

  public Channel memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Get memberCount
   * @return memberCount
  **/
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public Channel profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public Channel purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Channel channel = (Channel) o;
    return Objects.equals(this.id, channel.id) &&
        Objects.equals(this.name, channel.name) &&
        Objects.equals(this.memberCount, channel.memberCount) &&
        Objects.equals(this.profileImage, channel.profileImage) &&
        Objects.equals(this.purpose, channel.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, memberCount, profileImage, purpose);
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
    return gson.toJson(this, Channel.class);
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

