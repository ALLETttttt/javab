package exceptions;

import java.util.Scanner;

public class AdvancedExceptionClass {

    public static void processData(int data) throws AdvancedException {
        switch (data) {
            case 1 -> {
                throw new AdvancedException("Data is insufficient", 100);
            }
            case 2 -> {
                throw new AdvancedException("Data is invalid", 500);
            }
            default -> {
                System.out.println("Data is valid");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter data: ");
        int data = scanner.nextInt();
        try {
            processData(data);
        } catch (AdvancedException e) {
            System.err.println("Exception message: " + e.getMessage() + ", Error Code: " + e.getErrorCode());
        }
    }
}
