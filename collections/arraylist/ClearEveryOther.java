package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClearEveryOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements: ");
        String[] elements = scanner.nextLine().split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(elements));
        List<String> filteredList = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {
            filteredList.add(list.get(i));
        }

        for (String str: filteredList) {
            System.out.print(str + " ");
        }
        scanner.close();
    }
}
