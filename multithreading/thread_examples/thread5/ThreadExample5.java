package multithreading.thread_examples.thread5;

public class ThreadExample5 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Thread is running...");
            System.out.println("Thread is finished.");
        };

        Thread thread = new Thread( runnable );
        thread.start();
    }
}
