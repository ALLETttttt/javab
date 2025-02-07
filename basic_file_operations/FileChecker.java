package basic_file_operations;

import java.io.File;
import java.util.Scanner;

public class FileChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name for checkin the existence: ");
        String filename = scanner.next();

        File file = new File(filename);

        System.out.println(file.exists());
    }
}
