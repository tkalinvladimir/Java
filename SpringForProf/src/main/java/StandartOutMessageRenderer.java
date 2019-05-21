public class StandartOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
