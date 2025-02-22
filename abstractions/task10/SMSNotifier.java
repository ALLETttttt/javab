package abstractions.task10;

class SMSNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent: \"" + message + "\"");
    }
}
