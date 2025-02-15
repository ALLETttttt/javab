package try_catch_finally;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = scanner.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line = bufferedReader.readLine();
            if (line != null) {
                System.out.println(line);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file " + e.getMessage());
        }
    }
}
