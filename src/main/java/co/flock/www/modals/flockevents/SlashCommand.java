package co.flock.www.modals.flockevents;

/**
 * This event modal is generated when a user enters a slash command. It can be either sent to the app service in case of dispatchEvent, or appended to the URL as a query parameter FlockEvent when opening the URL in a widget or a browser via openWidget or openBrowser, respectively.
 */
public class SlashCommand extends FlockEvent {
    private String userName;
    private String chat;
    private String chatName;
    private String command;
    private String text;

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

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
