package basics;

import java.util.Scanner;

public class ModuloTester {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = sn.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sn.nextInt();

        System.out.printf("The remainder is %s", number % divisor);
    }
}
