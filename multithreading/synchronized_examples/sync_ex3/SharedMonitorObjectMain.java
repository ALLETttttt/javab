package multithreading.synchronized_examples.sync_ex3;

public class SharedMonitorObjectMain {
    public static void main(String[] args) {
        Object monitor1 = new Object();
        SharedMonitorObject smo1 = new SharedMonitorObject(monitor1);
        SharedMonitorObject smo2 = new SharedMonitorObject(monitor1);

        smo1.increment();
        smo2.increment();

        Object monitor2 = new Object();
        SharedMonitorObject smo3 = new SharedMonitorObject(monitor2);
        smo3.increment();
    }
}
