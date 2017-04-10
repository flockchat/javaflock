

package co.flock.model;

import java.util.Objects;
import co.flock.model.AttachmentButton;
import co.flock.model.AttachmentDownload;
import co.flock.model.Views;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

/**
 * Attachment
 */
public class Attachment {
  private String id = null;

  private String appId = null;

  private String title = null;

  private String description = null;

  private String color = null;

  private Views views = null;

  private String url = null;

  private Boolean forward = null;

  private List<AttachmentDownload> downloads = new ArrayList<AttachmentDownload>();

  private List<AttachmentButton> buttons = new ArrayList<AttachmentButton>();

  public Attachment id(String id) {
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

  public Attachment appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Attachment title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Attachment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Attachment color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Attachment views(Views views) {
    this.views = views;
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  public Views getViews() {
    return views;
  }

  public void setViews(Views views) {
    this.views = views;
  }

  public Attachment url(String url) {
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

  public Attachment forward(Boolean forward) {
    this.forward = forward;
    return this;
  }

   /**
   * Get forward
   * @return forward
  **/
  public Boolean getForward() {
    return forward;
  }

  public void setForward(Boolean forward) {
    this.forward = forward;
  }

  public Attachment downloads(List<AttachmentDownload> downloads) {
    this.downloads = downloads;
    return this;
  }

  public Attachment addDownloadsItem(AttachmentDownload downloadsItem) {
    this.downloads.add(downloadsItem);
    return this;
  }

   /**
   * Get downloads
   * @return downloads
  **/
  public List<AttachmentDownload> getDownloads() {
    return downloads;
  }

  public void setDownloads(List<AttachmentDownload> downloads) {
    this.downloads = downloads;
  }

  public Attachment buttons(List<AttachmentButton> buttons) {
    this.buttons = buttons;
    return this;
  }

  public Attachment addButtonsItem(AttachmentButton buttonsItem) {
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * Get buttons
   * @return buttons
  **/
  public List<AttachmentButton> getButtons() {
    return buttons;
  }

  public void setButtons(List<AttachmentButton> buttons) {
    this.buttons = buttons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.appId, attachment.appId) &&
        Objects.equals(this.title, attachment.title) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.color, attachment.color) &&
        Objects.equals(this.views, attachment.views) &&
        Objects.equals(this.url, attachment.url) &&
        Objects.equals(this.forward, attachment.forward) &&
        Objects.equals(this.downloads, attachment.downloads) &&
        Objects.equals(this.buttons, attachment.buttons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appId, title, description, color, views, url, forward, downloads, buttons);
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
    return gson.toJson(this, Attachment.class);
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

