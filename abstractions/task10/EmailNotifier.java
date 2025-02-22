package abstractions.task10;

class EmailNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent: \"" + message + "\"");
    }
}