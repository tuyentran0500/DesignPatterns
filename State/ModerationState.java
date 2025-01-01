package State;

class ModerationState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering document in Moderation...");
    }

    @Override
    public void publish(DocumentContext context) {
        System.out.println("Publishing Moderation: Moving to Published state.");
        context.setState(new PublishedState());
    }
}
