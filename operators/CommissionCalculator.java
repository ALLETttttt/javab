package operators;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your total sales: ");

        try {
            double sales = Double.parseDouble(scanner.nextLine().trim());

            if (sales < 0) {
                System.out.println("Error: Please enter a valid sales amount.");
                return;
            }

            String tier;
            double commission;

            switch ((int) Math.floor(sales / 10000)) {
                case 0 -> {
                    if (sales < 5000) {
                        tier = "Bronze";
                        commission = 0.03;
                    } else {
                        tier = "Silver";
                        commission = 0.05;
                    }
                }
                case 1, 2 -> {
                    if (sales <= 20000) {
                        tier = "Silver";
                        commission = 0.05;
                    } else {
                        tier = "Gold";
                        commission = 0.07;
                    }
                }
                default -> {
                    if (sales > 50000) {
                        tier = "Platinum";
                        commission = 0.1;
                    } else {
                        tier = "Gold";
                        commission = 0.07;
                    }
                }
            }

            double earnedCommission = sales * commission;
            System.out.printf("Tier: %s%n" +
                    "Earned commission $%.2f", tier, earnedCommission);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input.");
        }
    }
}
