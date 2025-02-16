package streamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringMapping {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> squaredList = list.stream()
                .filter(n -> n % 2 == 0)
                .map(x -> x * x)
                .toList();
        System.out.println(squaredList);
    }
}
