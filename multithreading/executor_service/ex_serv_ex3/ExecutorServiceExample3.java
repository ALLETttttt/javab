package multithreading.executor_service.ex_serv_ex3;

import java.util.concurrent.*;

public class ExecutorServiceExample3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future future = executorService.submit(newCallable("Task 2.1.1"));

        System.out.println(future.isDone()); // false

        try {
            String res = (String) future.get();
            System.out.println(res);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(future.isDone()); // true

        executorService.shutdown();
    }

    public static Callable<String> newCallable(String msg) {
        return new Callable() {
            @Override
            public Object call() throws Exception {
                return Thread.currentThread().getName() + ": " + msg;
            }
        };
    }
}
