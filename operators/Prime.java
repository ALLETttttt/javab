package operators;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Write your integer: ");

        int number = sc.nextInt();


        if (number == 0 || number == 1) {
            System.out.printf("%d is not prime!", number);
            return;
        }

        if (number == 2) {
            System.out.printf("%d is prime!", number);
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.printf("%d is prime!", number);
            return;
        }
        System.out.printf("%d is not prime!", number);
    }
}
