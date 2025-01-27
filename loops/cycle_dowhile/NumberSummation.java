package loops.cycle_dowhile;

import java.util.Scanner;

public class NumberSummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        int sum = 0;
        do {
            System.out.print("Enter number: ");
            choice = scanner.nextInt();

            if (choice >= 0) {
                sum += choice;
            }
        } while (choice >= 0);

        System.out.printf("The sum of the numbers is %d.", sum);
    }
}
