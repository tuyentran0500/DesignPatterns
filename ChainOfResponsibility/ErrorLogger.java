package ChainOfResponsibility;

class ErrorLogger extends AbstractLogger {
    @Override
    public void log(String level, String message) {
        if (level.equals("ERROR")) {
            System.out.println("ERROR: " + message);
        } else {
            forward(level, message);
        }
    }
}