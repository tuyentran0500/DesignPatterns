package ChainOfResponsibility;

public class LoggerChain {
    public static Logger getChainOfLoggers(){
        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InforLogger();
        Logger errorLogger = new ErrorLogger();

        debugLogger.setNext(infoLogger);
        infoLogger.setNext(errorLogger);
        return debugLogger;
    }
}
