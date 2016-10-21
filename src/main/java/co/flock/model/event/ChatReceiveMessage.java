package co.flock.model.event;
import co.flock.model.message.Message;

/**
 * This event modal is sent to the app service when a message is sent to an app's bot.
 */
public class ChatReceiveMessage extends FlockEvent {
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
