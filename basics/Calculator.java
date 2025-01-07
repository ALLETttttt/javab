package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int firstNum = getValidInput(sn, "Your first input: ");

        int secondNum = getValidInput(sn, "Your second input: ");

        System.out.printf("Sum: %s + %s = %s%n", firstNum, secondNum, firstNum + secondNum);

        System.out.printf("Product: %s x %s = %s%n", firstNum, secondNum, firstNum * secondNum);

        int variance = calculateVariance(firstNum, secondNum);

        System.out.printf("Variance: %s", variance);

        sn.close();
    }

    private static int getValidInput(Scanner scanner, String prompt) {
        while(true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.nextLine();
            }
        }
    }

    private static int calculateVariance(int num1, int num2) {
        int mean = (num1 + num2) / 2;
        int res = 0;
        res += (int) Math.pow(num1 - mean, 2);
        res += (int) Math.pow(num2 - mean, 2);

        return res / 2;
    }
}
