package co.flock.www.modals.message.attachments;

public class Action {
    private String type;
    private String url;
    private String desktopType;
    private String mobileType;
    private boolean sendContext;

    public void  addOpenWidget(String url , String desktopType , String mobileType){
        this.desktopType = desktopType;
        this.mobileType = mobileType;
        this.type = "openWidget";
        this.url = url;
    }

    public void  addOpenBrowser(String url , boolean sendContext){
        this.type = "openBrowser";
        this.url = url;
        this.sendContext = sendContext;
    }

    public  void  addDispatchEvent(){
        this.type = "sendToAppService";
    }

}
