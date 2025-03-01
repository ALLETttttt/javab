package enum_class.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Welcome to menu--");
        while (true) {
            System.out.print("Choose your option (1.START 2.STOP 3.SETTINGS 4.HELP):");
            String option = scanner.next();
            boolean exit = false;
            switch (option) {
                case "1" -> {
                    MenuOption.START.perform();
                }
                case "2" -> {
                    MenuOption.STOP.perform();
                }
                case "3" -> {
                    MenuOption.SETTINGS.perform();
                }
                case "4" -> {
                    MenuOption.HELP.perform();
                }
                case "5" -> {
                    System.out.println("Quitting the application...");
                    exit = true;
                }
                default -> {
                    System.out.println("Invalid option was entered.");
                }
            }
            if (exit) {
                break;
            }
        }
    }
}
