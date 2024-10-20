package linkedin.notification;

public class JobPostNotification implements Notification{
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
