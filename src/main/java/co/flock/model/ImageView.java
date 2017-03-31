

package co.flock.model;

import java.util.Objects;
import co.flock.model.Image;
import com.google.gson.Gson;

/**
 * ImageView
 */
public class ImageView {
  private Image original = null;

  private Image thumbnail = null;

  private String filename = null;

  public ImageView original(Image original) {
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  public Image getOriginal() {
    return original;
  }

  public void setOriginal(Image original) {
    this.original = original;
  }

  public ImageView thumbnail(Image thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  public Image getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(Image thumbnail) {
    this.thumbnail = thumbnail;
  }

  public ImageView filename(String filename) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageView imageView = (ImageView) o;
    return Objects.equals(this.original, imageView.original) &&
        Objects.equals(this.thumbnail, imageView.thumbnail) &&
        Objects.equals(this.filename, imageView.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original, thumbnail, filename);
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
    return gson.toJson(this, ImageView.class);
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

