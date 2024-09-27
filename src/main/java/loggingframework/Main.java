package loggingframework;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("Hello");
        LogConfiguration logConfiguration = new LogConfiguration(LogLevel.DEBUG,new DatabaseAdapter());
        logger.setLogConfiguration(logConfiguration);

        logger.debug("this is debug message");
        logger.error("this is error message");
    }
}
