package ChainOfResponsibility;

public class InforLogger extends AbstractLogger {
    @Override
    public void log(String level, String message) {
        if (level.equals("INFO")){
            System.out.println("INFO:" + message);
        }
        else {
            forward(level, message);
        }
    }
}
