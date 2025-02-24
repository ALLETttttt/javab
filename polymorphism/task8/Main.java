package polymorphism.task8;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        Notifier notifier1 = new PushNotifier();
        Notifier notifier2 = new SMSNotifier();

        notifier.sendNotification();
        notifier1.sendNotification();
        notifier2.sendNotification();
    }
}
