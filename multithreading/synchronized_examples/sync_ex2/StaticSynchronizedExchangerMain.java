package multithreading.synchronized_examples.sync_ex2;

public class StaticSynchronizedExchangerMain {
    public static void main(String[] args) {
        Thread writer1 = new Thread(() -> {
            StaticSynchronizedExchanger.setStaticObject("Writer 1 - is writing...");
            System.out.println(Thread.currentThread().getName() + ": Writer 1");
        });

        Thread writer2 = new Thread(() -> {
            StaticSynchronizedExchanger.setStaticObject("Writer 2 - is writing...");
            System.out.println(Thread.currentThread().getName() + ": Writer 2");
        });

        Thread reader1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + StaticSynchronizedExchanger.getStaticObject());
        });

        Thread reader2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + StaticSynchronizedExchanger.getStaticObject());
        });

        writer1.start();
        writer2.start();
        reader1.start();
        reader2.start();
    }
}
