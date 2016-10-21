package co.flock.model.event;

/**
 * This event modal is sent to the app service when an app has been successfully installed by a user.
 */
public class AppInstall extends FlockEvent {
    private String userToken;

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
