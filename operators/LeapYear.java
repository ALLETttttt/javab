package operators;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value(integer): ");
        int number = sc.nextInt();

        if ((number % 4 == 0 && number % 100 != 0) || number % 400 == 0) {
            System.out.printf("%s is a leap year", number);
        } else {
            System.out.printf("%s is not a leap year", number);
        }
    }
}
