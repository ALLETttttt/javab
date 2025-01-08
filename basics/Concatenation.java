package basics;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sn.next();

        System.out.print("Enter last name: ");
        String secondName = sn.next();

        System.out.printf("Full name: %s %s", firstName, secondName);
    }
}
