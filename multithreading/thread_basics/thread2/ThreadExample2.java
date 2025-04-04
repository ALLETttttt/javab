package multithreading.thread_basics.thread2;

public class ThreadExample2 {
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("My Custom Thread is running " + this.getName());
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
