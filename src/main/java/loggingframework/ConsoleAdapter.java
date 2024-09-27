package loggingframework;

public class ConsoleAdapter implements Adapter{
    @Override
    public void printMessage(Message message) {
        System.out.println(" ConsoleAdapter " + message.getLogLevel() + " " + message.getTimeStamp() + " " + message.getContent());
    }
}
