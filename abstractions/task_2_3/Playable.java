package abstractions.task_2_3;

public interface Playable {
    void play();

    default void tuneInstrument() {
        System.out.println("Tuning the instrument...");
    }
}
