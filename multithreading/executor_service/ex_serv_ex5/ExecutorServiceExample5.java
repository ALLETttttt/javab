package multithreading.executor_service.ex_serv_ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Callable<String>> callables = new ArrayList<>();

        callables.add(newCallable("Task 1.1.1"));
        callables.add(newCallable("Task 1.1.2"));
        callables.add(newCallable("Task 1.1.3"));

        try {
            List<Future<String>> tasks = executorService.invokeAll(callables);

            for (Future future: tasks) {
                System.out.println(future.get());
            }
        }  catch (ExecutionException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

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
