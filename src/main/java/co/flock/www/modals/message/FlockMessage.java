package co.flock.www.modals.message;


public class FlockMessage {
    private Message message;

    public FlockMessage(Message message){
        this.message = message;
    }

    public FlockMessage(){

    }

    public Message getMessage() {
        return message;
    }
}
