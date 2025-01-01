package State;

class PublishedState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering Published document...");
    }

    @Override
    public void publish(DocumentContext context) {
        System.out.println("The document is already Published.");
    }
}
