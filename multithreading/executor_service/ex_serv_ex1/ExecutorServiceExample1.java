package multithreading.executor_service.ex_serv_ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {
//        ExecutorService service =
//                  Executors.newSingleThreadExecutor(); used only for single thread
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(newRunnable("Task 1"));
        executorService.execute(newRunnable("Task 2"));

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        executorService.execute(newRunnable("Task 3"));

        executorService.shutdown();
    }

    public static Runnable newRunnable(String message) {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + message);
            }
        };
    }
}
