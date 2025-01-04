package basics;

import java.util.Scanner;

public class Converter {
    private static final String FTOC = "FtoC(from Fahrenheit to Celsius)";
    private static final String CTOF = "CtoF(from Celsius to Fahrenheit)";

    public static void main(String[] args) {
        boolean conversionFlag = true;

        Scanner scanner = new Scanner(System.in);

        while (conversionFlag) {
            getConversionOptions();

            int option = getOption(scanner);
            double value = getValue(scanner);

            performConversion(option, value);

            System.out.print("Do you want to perform another conversion? (yes/no): ");
            conversionFlag = scanner.next().equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for using converter!");
        scanner.close();
    }

    private static void getConversionOptions() {
        System.out.printf("Choose conversion direction:%n" +
                "1 - %s%n" +
                "2 - %s%n", FTOC, CTOF);
    }

    private static int getOption(Scanner scanner) {
        int option = -1;
        while (option != 1 && option != 2) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option != 1 && option != 2) {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return option;
    }

    private static double getValue(Scanner scanner) {
        System.out.print("Enter the value to convert: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static void performConversion(int option, double value) {
        switch (option) {
            case 1 -> convertFahrenheitToCelsius(value);
            case 2 -> convertCelsiusToFahrenheit(value);
            default -> System.out.println("Invalid option. Please choose 1 or 2.");
        }
    }

    private static void convertFahrenheitToCelsius(double fahrenheit) {
        System.out.printf("You have chosen '%s'%n", FTOC);
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.printf("Converted value: %.2f°C%n", celsius);
    }

    private static void convertCelsiusToFahrenheit(double celsius) {
        System.out.printf("You have chosen '%s'%n", CTOF);
        double fahrenheit = (celsius * (9.0 / 5)) + 32;
        System.out.printf("Converted value: %.2f°F%n", fahrenheit);
    }
}
