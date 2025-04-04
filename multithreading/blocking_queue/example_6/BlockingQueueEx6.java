package multithreading.blocking_queue.example_6;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx6 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        blockingQueue.add("2323");
        blockingQueue.add("44");
        blockingQueue.add("4ewdw");

        String element1 = blockingQueue.peek(); // will print null if empty

        System.out.println(element1);

        try {
            String element2 = blockingQueue.element();
            System.out.println(element2);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
