package State;

public class DraftState implements DocumentState {

    @Override
    public void render() {
        System.out.println("Rendering Draft document...");
    }

    @Override
    public void publish(DocumentContext context) {
        System.out.println("Publishing Draft: Moving to Moderation state.");
        context.setState(new ModerationState());
    }
    
}
