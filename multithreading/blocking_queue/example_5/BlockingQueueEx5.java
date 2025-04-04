package multithreading.blocking_queue.example_5;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx5 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        blockingQueue.add("44");
        blockingQueue.add("3");
        blockingQueue.add("12313");

        ArrayList<String> arrayList = new ArrayList<>();

        blockingQueue.drainTo(arrayList, 2);

        System.out.println(arrayList);
    }
}
