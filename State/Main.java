package State;

public class Main {
    public static void main(String[] args) {
        DocumentContext document = new DocumentContext();

        document.render();  // Draft behavior
        document.publish(); // Transition to Moderation

        document.render();  // Moderation behavior
        document.publish(); // Transition to Published

        document.render();  // Published behavior
        document.publish(); // No transition
    }
}
