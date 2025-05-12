package AbstractFactory;

public class Demo {
    //  private static Application configureApplication() {
    //     Application app;
    //     GUIFactory factory;
    //     String osName = System.getProperty("os.name").toLowerCase();
    //     if (osName.contains("mac")) {
    //         factory = new MacGUIFactory();
    //     } else {
    //         factory = new WinGUIFactory();
    //     }
    //     app = new Application(factory);
    //     return app;
    // }

    public static void main(String[] args) {
        // The main point here is that app is not caring whether or not we will use os/wins
        // They only care if we can implement a function, which is paint.
        // Application app = configureApplication();
        // app.paint();
    }
}
