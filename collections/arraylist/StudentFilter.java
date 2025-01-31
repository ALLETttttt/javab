package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesInput = scanner.nextLine().split(" ");
        String[] emailsInput = scanner.nextLine().split(" ");

        List<String> names = new ArrayList<>(Arrays.asList(namesInput));
        List<String> emails = new ArrayList<>(Arrays.asList(emailsInput));

        System.out.println("Edu students: ");
        for (int i = 0; i < names.size(); i++) {
            String email = emails.get(i);
            if (email.endsWith(".edu")) {
                String institution = email.split("@")[1].replace(".edu", "");
                System.out.println(names.get(i) + " - Institution: " + institution);
            }
        }

    }
}
