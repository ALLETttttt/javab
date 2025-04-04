package multithreading.thread_basics.thread9;

public class ThreadExample9 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                System.out.println("Running...");
                sleep(1000);
            }
        };

        Thread thread = new Thread( runnable );
        thread.setDaemon(true);
        thread.start();
        sleep(3100);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
