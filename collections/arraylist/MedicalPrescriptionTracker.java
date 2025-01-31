package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MedicalPrescriptionTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Medicines: ");
        String[] medicinesInput = scanner.nextLine().split(" ");

        List<String> medicines = new ArrayList<>(Arrays.asList(medicinesInput));
        List<String> uniqueMedicines = new ArrayList<>();
        List<Integer> counted = new ArrayList<>();

        int max = 0;

        for (String med : medicines) {
            if (!uniqueMedicines.contains(med)) {
                uniqueMedicines.add(med);
                int cnt = 0;
                for (String m : medicines) {
                    if (med.equals(m)) {
                        cnt++;
                    }
                }
                counted.add(cnt);
                max = Math.max(max, cnt);
            }
        }

        List<String> mostPrescribed = new ArrayList<>();
        for (int i = 0; i < counted.size(); i++) {
            if (counted.get(i) == max) {
                mostPrescribed.add(uniqueMedicines.get(i));
            }
        }

        System.out.print("Most Prescribed Medicine(s): ");
        System.out.println(String.join(", ", mostPrescribed));

        scanner.close();
    }
}
