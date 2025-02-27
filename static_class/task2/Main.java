package static_class.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(
                1, 2, 5, 665, 65, 23, 121124, 53, 34124, 2312
        ));

        System.out.println(ArrayOperations.findMax(list));
    }
}
