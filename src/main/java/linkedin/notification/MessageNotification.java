package linkedin.notification;

public class MessageNotification implements Notification{
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
