package polymorphism.task8;

public class PushNotifier implements Notifier {
    @Override
    public void sendNotification() {
        System.out.println("Notification with push notifier.");
    }
}
