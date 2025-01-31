package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PatientFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] patientsInput = scanner.nextLine().split(" ");
        String[] diseasesInput = scanner.nextLine().split(" ");
        String[] agesInput = scanner.nextLine().split(" ");

        List<String> patients = new ArrayList<>(Arrays.asList(patientsInput));
        List<String> diseases = new ArrayList<>(Arrays.asList(diseasesInput));
        List<String> ages = new ArrayList<>(Arrays.asList(agesInput));
        List<Integer> averageAge = new ArrayList<>();

        System.out.println("Patients with Influenza: ");
        for (int i = 0; i < patients.size(); i++) {
            if (diseases.get(i).equals("Influenza")) {
                System.out.println(patients.get(i) + " - Age: " + ages.get(i));
                averageAge.add(Integer.valueOf(ages.get(i)));
            }
        }

        System.out.println();

        int sum = 0;
        for (int age: averageAge) {
            sum += age;
        }
        System.out.println("Average Age: " + (double) sum / averageAge.size());
    }
}
