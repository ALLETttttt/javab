package multithreading.blocking_queue.example_2;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<String> blockingQueue = null;

    public Producer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            long millis = System.currentTimeMillis();
            try {
                this.blockingQueue.put("" + millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sleep(3000);
        }
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
