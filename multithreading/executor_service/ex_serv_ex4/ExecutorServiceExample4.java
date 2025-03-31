package multithreading.executor_service.ex_serv_ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> callables = new ArrayList<>();

        callables.add(newCallable("Task 1.1.1"));
        callables.add(newCallable("Task 1.1.2"));
        callables.add(newCallable("Task 1.1.3"));

        try {
            String res = (String) executorService.invokeAny(callables);
            System.out.println(res);
        }  catch (ExecutionException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        executorService.shutdown();
    }

    public static Callable<String> newCallable(String msg) {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName() +": " + msg;
            }
        };
    }
}
