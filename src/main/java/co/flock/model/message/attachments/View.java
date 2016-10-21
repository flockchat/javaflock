package co.flock.model.message.attachments;

public class View {
    private WidgetView widget;
    private HtmlView html;
    private String flockml;
    private ImageView image;

    public WidgetView getWidget() {
        return widget;
    }

    public void setWidget(WidgetView widget) {
        this.widget = widget;
    }

    public HtmlView getHtml() {
        return html;
    }

    public void setHtml(HtmlView html) {
        this.html = html;
    }

    public String getFlockml() {
        return flockml;
    }

    public void setFlockml(String flockml) {
        this.flockml = flockml;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
