package multithreading.synchronized_examples.sync_ex1;

public class SynchronizedExchangerMain {
    public static void main(String[] args) {
        SynchronizedExchanger exchanger = new SynchronizedExchanger();

        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            exchanger.setObject(""+i);
                        }
                    }
                }
        );

        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(exchanger.getObject());
                        }
                    }
                }
        );

        try {
            thread1.start();
            thread1.join();
            thread2.start();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
