package ChainOfResponsibility;

abstract public class AbstractLogger implements Logger {
    protected Logger nextLogger;
    @Override
    public void setNext(Logger logger) {
        this.nextLogger = logger;
    }

    protected void forward(String level, String message){
        if (nextLogger != null){
            nextLogger.log(level, message);
        }
    }
}
