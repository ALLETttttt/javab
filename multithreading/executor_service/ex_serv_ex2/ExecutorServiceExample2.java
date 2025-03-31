package multithreading.executor_service.ex_serv_ex2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future future = executorService.submit(newRunnable("Task 1.1.1"));

        System.out.println(future.isDone()); // false

//        try {
//            future.get();
//        } catch (ExecutionException | InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println(future.isDone()); // true

        executorService.shutdown();
    }

    public static Runnable newRunnable(String msg) {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + msg);
            }
        };
    }
}
