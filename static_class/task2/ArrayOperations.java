package static_class.task2;

import java.util.List;

public class ArrayOperations {

    public static int findMax(List<Integer> list) {
        int max = 0;
        for (int num: list) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
