package co.flock.www.model.event;

/**
 * This event modal is generated when a user presses a button.
 */
public class PressButton extends FlockEvent {
    private String button;
    private String userName;
    private String chat;
    private String chatName;

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }
}
