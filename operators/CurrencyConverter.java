package operators;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source currency (USD, EUR, GBP, JPY, AUD): ");
        String sourceCurrency = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter the target currency (USD, EUR, GBP, JPY, AUD): ");
        String targetCurrency = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        if (sourceCurrency.equals(targetCurrency)) {
            System.out.println("Source and target currencies cannot be the same.");
            return;
        }

        double conversionRate = 0.0;

        switch (sourceCurrency) {
            case "USD" -> {
                switch (targetCurrency) {
                    case "EUR" -> conversionRate = 0.9;
                    case "GBP" -> conversionRate = 0.8;
                    case "JPY" -> conversionRate = 110.0;
                    case "AUD" -> conversionRate = 1.5;
                    default -> {
                        invalidCurrency(targetCurrency);
                        return;
                    }
                }
            }
            case "EUR" -> {
                switch (targetCurrency) {
                    case "USD" -> conversionRate = 1.11;
                    case "GBP" -> conversionRate = 0.89;
                    case "JPY" -> conversionRate = 122.0;
                    case "AUD" -> conversionRate = 1.67;
                    default -> {
                        invalidCurrency(targetCurrency);
                        return;
                    }
                }
            }
            case "GBP" -> {
                switch (targetCurrency) {
                    case "USD" -> conversionRate = 1.25;
                    case "EUR" -> conversionRate = 1.12;
                    case "JPY" -> conversionRate = 137.0;
                    case "AUD" -> conversionRate = 1.87;
                    default -> {
                        invalidCurrency(targetCurrency);
                        return;
                    }
                }
            }
            case "JPY" -> {
                switch (targetCurrency) {
                    case "USD" -> conversionRate = 0.0091;
                    case "EUR" -> conversionRate = 0.0082;
                    case "GBP" -> conversionRate = 0.0073;
                    case "AUD" -> conversionRate = 0.0136;
                    default -> {
                        invalidCurrency(targetCurrency);
                        return;
                    }
                }
            }
            case "AUD" -> {
                switch (targetCurrency) {
                    case "USD" -> conversionRate = 0.67;
                    case "EUR" -> conversionRate = 0.6;
                    case "GBP" -> conversionRate = 0.54;
                    case "JPY" -> conversionRate = 73.5;
                    default -> {
                        invalidCurrency(targetCurrency);
                        return;
                    }
                }
            }
            default -> {
                invalidCurrency(sourceCurrency);
                return;
            }
        }

        double convertedAmount = amount * conversionRate;

        System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
    }

    public static void invalidCurrency(String currency) {
        System.out.println("Invalid currency code: " + currency);
    }
}
