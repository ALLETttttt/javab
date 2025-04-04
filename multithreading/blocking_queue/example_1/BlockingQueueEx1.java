package multithreading.blocking_queue.example_1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx1 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        blockingQueue.put("Element 1");
        blockingQueue.put("Element 2");

        String element1 = blockingQueue.take();
        String element2 = blockingQueue.take();

        System.out.println(element1);
        System.out.println(element2);

    }
}
