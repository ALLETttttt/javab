package basics;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Welcome to my first Java App! Write your name: ");
        String name = sn.next();

        System.out.printf("Hello, %s. Write your surname: ", name);
        String surname = sn.next();

        sn.nextLine();

        System.out.print("Write about some information about yourself: ");
        String info = sn.nextLine();

        System.out.printf("Very fascinating, %s %s! I got about you: %s", name, surname, info);

    }
}
