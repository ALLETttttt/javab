package loops.cycle_while;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(10) + 1;

        while (true) {
            System.out.print("Guess the number: ");
            int guessedNum = scanner.nextInt();

            if (guessedNum > randomNum) {
                System.out.println("Too high!");
            }

            if (guessedNum < randomNum) {
                System.out.println("Too low!");
            }

            if (guessedNum == randomNum) {
                System.out.println("Correct!");
                break;
            }
        }
    }
}
