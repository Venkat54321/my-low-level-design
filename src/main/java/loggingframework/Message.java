package loggingframework;

import java.time.LocalDate;

public class Message {
    private LocalDate timeStamp;
    private LogLevel logLevel;
    private String content;

    public Message(LogLevel logLevel, String content) {
        this.logLevel = logLevel;
        this.content = content;
    }

    public LocalDate getTimeStamp() {
        return LocalDate.now();
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
