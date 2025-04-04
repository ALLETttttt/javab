package multithreading.synchronized_keyword.sync_ex4;

public class SyncCounterMain {
    public static void main(String[] args) {
        SyncCounter syncCounter = new SyncCounter();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    syncCounter.incCount();
                }
                System.out.println(Thread.currentThread().getName() + ": " + syncCounter.getCounter());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    syncCounter.incCount();
                }
                System.out.println(Thread.currentThread().getName() + ": " + syncCounter.getCounter());
            }
        });

        thread1.start();
        thread2.start();
    }
}
