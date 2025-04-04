package multithreading.thread_basics.thread4;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running...");
            }
        };

        Thread thread = new Thread( runnable );
        thread.start();
    }
}
