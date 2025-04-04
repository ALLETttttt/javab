package multithreading.synchronized_keyword.sync_ex3;

public class SharedMonitorObject {
    private Object monitor = null;
    private int counter = 0;

    public SharedMonitorObject(Object object) {
        if (object == null) {
            throw new IllegalArgumentException(
                    "Monitor object can not be null"
            );
        }
        this.monitor = object;
    }

    public void increment() {
        synchronized (this.monitor) {
            this.counter++;
        }
    }

}
