package multithreading.blocking_queue.example_7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx7 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(4);

        System.out.println(blockingQueue.remainingCapacity()); // 4

        blockingQueue.add("1212e");
        blockingQueue.add("dwec");

        System.out.println(blockingQueue.remainingCapacity()); // 2

        blockingQueue.add("2f2qerf");
        blockingQueue.add("qerfqr1232");

        System.out.println(blockingQueue.size()); // 4

        System.out.println(blockingQueue.remainingCapacity()); // 0

        System.out.println(blockingQueue.contains("1212e"));



    }
}
