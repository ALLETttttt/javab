package multithreading.lock;

public class CounterLockMain {
    public static void main(String[] args) {
        CounterLock counterLock = new CounterLock();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counterLock.inc();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counterLock.inc();
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(counterLock.getCounter());
    }
}
