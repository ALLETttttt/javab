package operators;

import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value(integer): ");
        int number = sc.nextInt();

        System.out.printf("The number is %s", number % 2 == 0 ? "EVEN": "ODD");
    }
}
