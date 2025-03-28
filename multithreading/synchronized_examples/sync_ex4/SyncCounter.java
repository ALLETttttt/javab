package multithreading.synchronized_examples.sync_ex4;

public class SyncCounter {
    private long counter = 0;

    public synchronized void incCount() {
        this.counter++;
    }

    public synchronized long getCounter() {
        return this.counter;
    }
}
