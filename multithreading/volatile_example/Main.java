package multithreading.volatile_example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                customerList.add(new Customer());
            }

        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                customerList.add(new Customer());
            }
        });

        try {
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        for (Customer customer : customerList) {
            System.out.println("Customer ID: " + customer.getId());
        }
    }
}
