package multithreading.thread_basics.thread1;

public class ThreadExample1 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        Thread thread1 = new Thread();
        thread.start();
        thread1.start();
        System.out.println(thread.getName());
        System.out.println(thread1.getName());
    }
}
