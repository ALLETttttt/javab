package multithreading.blocking_queue.example_4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueEx4 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        try {
            String element1 = blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String element2 = blockingQueue.poll();

        try {
            String element3 = blockingQueue.poll(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean wasRemoved = blockingQueue.remove("1");
    }
}
