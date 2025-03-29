package multithreading.volatile_example;

import java.util.concurrent.atomic.AtomicLong;

public class Customer {
    private static final AtomicLong atomicLong = new AtomicLong(1);
    private static volatile long idCounter = 1;
    private final long id;

    public Customer() {
        id = incrementID();
//        id = atomicLong.incrementAndGet();
    }

    public synchronized long incrementID() {
        return idCounter++;
    }

    public long getId() {
        return id;
    }

}
