package multithreading.thread_basics.thread8;

public class ThreadExample8 {
    public static class StoppableRunnable implements Runnable {

        private boolean isStopRequested = false;

        public synchronized void stopRequested() {
            this.isStopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.isStopRequested;
        }

        private void sleep(long millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        @Override
        public void run() {
            System.out.println("Stoppable Runnable running");
            while (!isStopRequested()) {
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("Stoppable Runnable is stopped.");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();

        Thread thread = new Thread(stoppableRunnable);
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Requesting stop");
        stoppableRunnable.stopRequested();
        System.out.println("Stop requested");
    }
}
