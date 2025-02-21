package abstraction.task_2_3;

public class Main {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        guitar.play();

        Playable piano = new Piano();
        piano.play();

        piano.tuneInstrument();
        guitar.tuneInstrument();
    }
}
