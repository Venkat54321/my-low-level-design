package linkedin.notification;

public class ConnectionNotification implements Notification{
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
