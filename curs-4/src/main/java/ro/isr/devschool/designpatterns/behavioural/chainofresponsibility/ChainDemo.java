package ro.isr.devschool.designpatterns.behavioural.chainofresponsibility;

/**
 * Created by Mucefix on 10/04/18.
 */
public class ChainDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;

    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        //loggerChain.logMessage(AbstractLogger.ERROR, "This is an error");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug message");

    }

}
