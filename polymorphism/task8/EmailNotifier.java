package polymorphism.task8;

public class EmailNotifier implements Notifier {

    @Override
    public void sendNotification() {
        System.out.println("Notification with email.");
    }
}
