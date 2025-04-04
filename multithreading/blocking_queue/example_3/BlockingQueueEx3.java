package multithreading.blocking_queue.example_3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueEx3 {
    public static void main(String[] args) {
        // enqueue methods
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        try {
            blockingQueue.put("1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            blockingQueue.add("2");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        boolean wasEnqueued1 = blockingQueue.offer("3");

        try {
            boolean wasEnqueued2 = blockingQueue.offer("4", 1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(blockingQueue);
    }
}
