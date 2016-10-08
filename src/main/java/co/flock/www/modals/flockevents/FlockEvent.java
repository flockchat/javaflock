package co.flock.www.modals.flockevents;

/**
 *  This modal is base modal available for all the events modal
 */
public class FlockEvent {
    private String name;
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
