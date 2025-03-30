package multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {
    private long counter = 0;
    private final Lock lock = new ReentrantLock();

    public void inc() {
        try {
            lock.lock();
            this.counter++;
        } finally {
            lock.unlock();
        }
    }

    public long getCounter() {
        try {
            lock.lock();
            return this.counter;
        } finally {
            lock.unlock();
        }
    }
}
