package try_catch_finally;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            System.out.print("Choose operation (1. Get element access 2. Division): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter index of the element: ");
                    int index = scanner.nextInt();

                    System.out.println(array[index]);
                }
                case 2 -> {
                    System.out.print("First input: ");
                    int a = scanner.nextInt();

                    System.out.print("Second input: ");
                    int b = scanner.nextInt();

                    System.out.println(a / b);
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
