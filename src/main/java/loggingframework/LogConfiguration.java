package loggingframework;

public class LogConfiguration {
    private LogLevel logLevel;
    private Adapter adapter;

    public LogConfiguration(LogLevel logLevel, Adapter adapter) {
        this.logLevel = logLevel;
        this.adapter = adapter;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public Adapter getAdapter() {
        return adapter;
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }
}
