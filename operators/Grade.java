package operators;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade: ");

        String grade = sc.next().trim().toLowerCase();

        switch (grade) {
            case "a" -> System.out.println("Excellent");
            case "b" -> System.out.println("Good");
            case "c" -> System.out.println("Average");
            case "d" -> System.out.println("Poor");
            case "f" -> System.out.println("Fail");
            default -> System.out.println("Invalid grade.");
        }
    }
}
