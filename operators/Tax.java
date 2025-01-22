package operators;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter income (e.g., $55000): ");
        String incomeStr = sc.next();

        System.out.print("Enter number of dependents: ");
        int dependents = sc.nextInt();

        System.out.print("Enter marriage status (Yes/No): ");
        String marriage = sc.next();
        boolean isMarried = "yes".equalsIgnoreCase(marriage);

        String[] incomeParts = incomeStr.split("\\$");
        int income = Integer.parseInt(incomeParts.length > 1 ? incomeParts[1] : incomeParts[0]);

        double tax;
        if (income <= 20000) {
            tax = income * 0.02;
        } else if (income <= 40000) {
            tax = income * 0.05;
        } else if (income <= 80000) {
            tax = income * 0.10;
        } else {
            tax = income * 0.20;
        }

        if (age < 18 || age > 60) {
            tax -= tax * 0.10;
        }
        if (dependents > 3) {
            tax -= tax * 0.05;
        }
        if (isMarried) {
            tax -= tax * 0.03;
        }

        System.out.printf("Total tax owed: $%.2f", tax);
    }
}
