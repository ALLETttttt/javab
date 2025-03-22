package multithreading.thread_examples.thread3;

public class ThreadExample3 {
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread is running with runnable interface");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread( new MyRunnable() );
        thread.start();
        thread.join();
        System.out.println(thread.getName());
    }
}
