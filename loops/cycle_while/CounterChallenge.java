package loops.cycle_while;

import java.util.Scanner;

public class CounterChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        int counter = 0;
        while (true) {
            System.out.print("Enter number: ");
            num = scanner.nextInt();
            if (num >= 0) {
                counter++;
                break;
            }
        }
        System.out.printf("You entered %d positive numbers.", counter);
        scanner.close();
    }
}
