package polymorphism.task8;

public class SMSNotifier implements Notifier {
    @Override
    public void sendNotification() {
        System.out.println("Notification with sms.");
    }
}
