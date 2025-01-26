package operators;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operation(addition, subtraction, multiplication, division, and modular operations): ");
        String operation = scanner.nextLine();

        System.out.print("Enter first number: ");
        String firstNumber = scanner.next();

        System.out.print("Enter second number: ");
        String secondNumber = scanner.next();

        try {
            double a = Double.parseDouble(firstNumber);
            double b = Double.parseDouble(secondNumber);

            switch (operation) {
                case "addition" -> System.out.printf("%s + %s = %s", a, b, a + b);
                case "subtraction" -> System.out.printf("%s - %s = %s", a, b, a - b);
                case "multiplication" -> System.out.printf("%s * %s = %s", a, b, a * b);
                case "division" -> {
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        break;
                    }
                    System.out.printf("%s / %s = %.2f", a, b, a / b);
                }
                case "modular operations" -> {
                    if (a == Math.floor(a) && b == Math.floor(b)) {
                        System.out.printf("%s %s %s = %s", a, '%', b, a % b);
                    } else {
                        System.out.println("Error: Please ensure both numbers are integers for the modulus operation.");
                    }
                }
                default -> System.out.println("Error: invalid operation selected.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input was written. Enter valid numbers.");
        }
    }
}
