package loops.cycle_for;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 to 7: ");
        int num = scanner.nextInt();

        if (num < 1 || num > 7) {
            System.out.println("Invalid input.");
            return;
        }

        for (int i = 1; i <= 1; i++) {
            switch (num) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }

        scanner.close();
    }
}
