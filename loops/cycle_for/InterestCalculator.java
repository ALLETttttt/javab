package loops.cycle_for;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        int p = scanner.nextInt();

        System.out.print("Enter the rate of interest (in %): ");
        int r = scanner.nextInt();

        System.out.print("Enter the time (in years): ");
        int t = scanner.nextInt();

        double simpleInterest = (double) (p*r*t) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        double totalAmount = simpleInterest + p;
        System.out.println("Total Amount after 2 years: " + totalAmount);
    }
}
