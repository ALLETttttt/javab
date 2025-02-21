package abstraction.task6;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        BasicPhone basicPhone = new BasicPhone();

        smartphone.call();
        smartphone.browse();
        smartphone.takePhoto();
        smartphone.play();
        smartphone.setAlarm();

        basicPhone.call();
        basicPhone.setAlarm();
    }
}
