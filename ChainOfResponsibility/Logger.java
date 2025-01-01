package ChainOfResponsibility;

public interface Logger {
    void setNext(Logger nexLogger);
    void log(String level, String message);
}
