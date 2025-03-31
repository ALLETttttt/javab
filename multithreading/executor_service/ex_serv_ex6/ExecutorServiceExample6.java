package multithreading.executor_service.ex_serv_ex6;

import java.util.concurrent.*;

public class ExecutorServiceExample6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future future = executorService.submit(newCallable("Task 1.1.1"));

        System.out.println(future.isDone());
        boolean mayInterrupt = true;
        future.cancel(mayInterrupt);

        try {
            String res = (String) future.get();
            System.out.println(res);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (CancellationException e) {
            System.out.println("Can not call future.get() method since task was cancelled.");
        }

        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
        executorService.shutdown();
    }

    public static Callable<String> newCallable(String msg) {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread
                        .currentThread()
                        .getName() +": " + msg;
            }
        };
    }
}
