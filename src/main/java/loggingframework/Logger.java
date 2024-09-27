package loggingframework;

public class Logger {
    private static Logger logger;
    private LogConfiguration logConfiguration;

    private Logger(){
       logConfiguration = new LogConfiguration(LogLevel.INFO,new ConsoleAdapter());
    }

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    private void log(LogLevel logLevel,String content){
        Message message = new Message(logLevel,content);
        logConfiguration.getAdapter().printMessage(message);
    }

    public void info(String content){
        log(LogLevel.INFO,content);
    }

    public void debug(String content){
        log(LogLevel.DEBUG,content);
    }

    public void error(String content){
        log(LogLevel.ERROR,content);
    }

    public void trace(String content){
        log(LogLevel.TRACE,content);
    }

    public LogConfiguration getLogConfiguration() {
        return logConfiguration;
    }

    public void setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }
}
