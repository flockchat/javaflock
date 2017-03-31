

package co.flock.model;

import java.util.Objects;
import co.flock.model.HtmlView;
import co.flock.model.ImageView;
import co.flock.model.WidgetView;
import com.google.gson.Gson;

/**
 * Views
 */
public class Views {
  private WidgetView widget = null;

  private HtmlView html = null;

  private String flockml = null;

  private ImageView image = null;

  public Views widget(WidgetView widget) {
    this.widget = widget;
    return this;
  }

   /**
   * Get widget
   * @return widget
  **/
  public WidgetView getWidget() {
    return widget;
  }

  public void setWidget(WidgetView widget) {
    this.widget = widget;
  }

  public Views html(HtmlView html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  public HtmlView getHtml() {
    return html;
  }

  public void setHtml(HtmlView html) {
    this.html = html;
  }

  public Views flockml(String flockml) {
    this.flockml = flockml;
    return this;
  }

   /**
   * Get flockml
   * @return flockml
  **/
  public String getFlockml() {
    return flockml;
  }

  public void setFlockml(String flockml) {
    this.flockml = flockml;
  }

  public Views image(ImageView image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public ImageView getImage() {
    return image;
  }

  public void setImage(ImageView image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Views views = (Views) o;
    return Objects.equals(this.widget, views.widget) &&
        Objects.equals(this.html, views.html) &&
        Objects.equals(this.flockml, views.flockml) &&
        Objects.equals(this.image, views.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(widget, html, flockml, image);
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
    return gson.toJson(this, Views.class);
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

