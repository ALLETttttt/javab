package abstractions.task6;

public class SmartPhone implements Alarm, Callable, Camera, Browsable, MusicPlayer{
    @Override
    public void call() {
        System.out.println("Making a call.");
    }

    @Override
    public void browse() {
        System.out.println("Browsing the internet.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo.");
    }

    @Override
    public void play() {
        System.out.println("Playing music.");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting an alarm.");
    }
}
