package basics;

import java.util.Scanner;

public class LengthChecker {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sn.next();

        System.out.println("Length of written string is " + str.length());
    }
}
