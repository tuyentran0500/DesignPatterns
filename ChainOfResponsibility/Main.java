package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getChainOfLoggers();

        loggerChain.log("DEBUG", "This is a debug message.");
        loggerChain.log("INFO", "This is an info message.");
        loggerChain.log("ERROR", "This is an error message.");
    }
}
