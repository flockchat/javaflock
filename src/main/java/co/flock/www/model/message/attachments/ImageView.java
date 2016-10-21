package co.flock.www.model.message.attachments;


public class ImageView {

    private Image original;
    private  Image thumbnail;
    private  String filename;

    public ImageView(Image original){
        this.setOriginal(original);
    }

    public  ImageView(){

    }

    public Image getOriginal() {
        return original;
    }

    public void setOriginal(Image original) {
        this.original = original;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
