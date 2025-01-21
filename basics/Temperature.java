package basics;

import java.util.Scanner;

public class Temperature {
    private static final double FAHRENHEIT_TO_CELSIUS_RATIO = 5.0 / 9;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Fahrenheit value: " );

        double value = sc.nextDouble();

        double res = FAHRENHEIT_TO_CELSIUS_RATIO * (value - 32);

        System.out.printf("Body temperature in Celsius: %s°C", res);
    }
}
