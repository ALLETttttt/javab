package collections.hashset;

import java.util.*;

public class RemoveOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");

        Set<Integer> numbers = new HashSet<>();

        for (String input: inputs) {
            numbers.add(Integer.parseInt(input));
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
