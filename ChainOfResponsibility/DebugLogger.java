package ChainOfResponsibility;

public class DebugLogger extends AbstractLogger {
    @Override
    public void log(String level, String message) {
        if (level.equals("DEBUG")){
            System.out.println("DEBUG:" + message);
        }
        else {
            forward(level, message);
        }
    }
}
