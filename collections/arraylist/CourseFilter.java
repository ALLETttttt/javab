package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CourseFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] coursesInput = scanner.nextLine().split(" ");
        String[] emailsInput = scanner.nextLine().split(" ");

        List<String> courses = new ArrayList<>(Arrays.asList(coursesInput));
        List<String> emails = new ArrayList<>(Arrays.asList(emailsInput));
        List<String> commonDomain = new ArrayList<>();

        System.out.println("Ed-tech Courses: ");
        for (int i = 0; i < courses.size(); i++) {
            String email = emails.get(i);
            if (email.endsWith(".ed-tech")) {
                String domain = email.split("@")[1].replace(".ed-tech", "");
                commonDomain.add(domain);
                System.out.println(courses.get(i) + " - Coordinator: " + email);
            }
        }

        int maxCount = 0;
        String mostCommonDomain = null;

        for (String domain: commonDomain) {
            int counter = 0;
            for (String d: commonDomain) {
                if (domain.equals(d)) {
                    counter++;
                }
            }
            if (counter > maxCount) {
                maxCount = counter;
                mostCommonDomain = domain;
            }
        }

        if (mostCommonDomain != null) {
            System.out.println("\nMost common domain: " + mostCommonDomain);
        } else {
            System.out.println("\nNo .ed-tech domains found.");
        }

        scanner.close();
    }
}
