package abstraction.task6;

public class BasicPhone implements Alarm, Callable {

    @Override
    public void call() {
        System.out.println("Making a call.");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting an alarm.");
    }

}
