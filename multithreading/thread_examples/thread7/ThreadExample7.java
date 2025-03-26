package multithreading.thread_examples.thread7;

public class ThreadExample7 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running " + threadName + " via runnable...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(threadName + " finished.");
        };

        Thread thread = new Thread( runnable, "New Thread" );
        thread.start();
    }
}
