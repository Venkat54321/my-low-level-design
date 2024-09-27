package loggingframework;

public class FileAdapter implements Adapter{
    @Override
    public void printMessage(Message message) {
        System.out.println(" FileAdapter" + message.getLogLevel() + " " + message.getTimeStamp() + " " + message.getContent());
    }
}
