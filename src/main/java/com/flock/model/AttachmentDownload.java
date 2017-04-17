

package com.flock.model;

import java.util.Objects;
import com.google.gson.Gson;

/**
 * AttachmentDownload
 */
public class AttachmentDownload {
  private String src = null;

  private String mime = null;

  private String filename = null;

  private Integer size = null;

  public AttachmentDownload src(String src) {
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

  public AttachmentDownload mime(String mime) {
    this.mime = mime;
    return this;
  }

   /**
   * Get mime
   * @return mime
  **/
  public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }

  public AttachmentDownload filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public AttachmentDownload size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentDownload attachmentDownload = (AttachmentDownload) o;
    return Objects.equals(this.src, attachmentDownload.src) &&
        Objects.equals(this.mime, attachmentDownload.mime) &&
        Objects.equals(this.filename, attachmentDownload.filename) &&
        Objects.equals(this.size, attachmentDownload.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, mime, filename, size);
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
    return gson.toJson(this, AttachmentDownload.class);
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

