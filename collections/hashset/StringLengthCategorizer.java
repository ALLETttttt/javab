package collections.hashset;

import java.util.*;

public class StringLengthCategorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        Set<String> animals = new HashSet<>(Arrays.asList(firstInput));

        Set<Integer> lengths = new HashSet<>();

        for (String animal: animals) {
            lengths.add(animal.length());
        }

        List<Integer> list = new ArrayList<>(lengths);
        Integer lastElement = list.get(list.size() - 1);

        for (int length: lengths) {
            System.out.print(length + "=[");
            boolean isFirst = true;
            for (String animal: animals) {
                if (animal.length() == length) {
                    if (!isFirst) {
                        System.out.print(", ");
                    }
                    isFirst = false;
                    System.out.print(animal);
                }
            }
            if (length == lastElement) {
                System.out.print("]");
            } else {
                System.out.print("], ");
            }
        }
    }
}
