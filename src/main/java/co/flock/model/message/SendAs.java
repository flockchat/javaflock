package co.flock.model.message;

/**
 * Created by devesh.k on 29/07/16.
 */
public class SendAs {
    private String name;
    private String profileImage;

    public SendAs(String name, String profileImage) {
        this.setName(name);
        this.setProfileImage(profileImage);
    }

    public void FlockSendAs() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
