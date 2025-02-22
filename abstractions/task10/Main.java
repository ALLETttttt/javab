package abstractions.task10;

public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();
        Notifier inAppNotifier = new InAppNotifier();

        System.out.println("Sample Input 1:");
        emailNotifier.sendNotification("Your task deadline is approaching.");

        System.out.println("Sample Input 2:");
        inAppNotifier.sendNotification("Your task deadline is approaching.");
    }
}
