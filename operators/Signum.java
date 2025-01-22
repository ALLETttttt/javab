package operators;

import java.util.Scanner;

public class Signum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value(integer): ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.print("The number is zero");
            return;
        }

        System.out.printf("The number is %s", number > 0 ? "positive": "negative");
    }
}
