package loggingframework;

public class DatabaseAdapter implements Adapter{
    @Override
    public void printMessage(Message message) {
        System.out.println("DatabaseAdapter " + message.getLogLevel() + " " + message.getTimeStamp() + " " + message.getContent());
    }
}
