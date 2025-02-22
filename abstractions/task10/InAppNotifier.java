package abstractions.task10;

class InAppNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("In-app notification sent: \"" + message + "\"");
    }
}