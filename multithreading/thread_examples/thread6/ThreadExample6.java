package multithreading.thread_examples.thread6;

public class ThreadExample6 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread '" + threadName + "' is running...");
        };

        Thread thread2 = new Thread( runnable, "Ultimate Thread from Bakdaulet 2" );
        Thread thread1 = new Thread( runnable, "Ultimate Thread from Bakdaulet 1" );
        thread1.start();
        thread2.start();
    }
}
