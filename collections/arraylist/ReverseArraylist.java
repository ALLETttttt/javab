package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ReverseArraylist {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                List.of(
                        19, 2, 3, 4, 4, 5, 45, 4, 1, 34, 2
                )
        );

        System.out.println(numbers.reversed());
    }
}
