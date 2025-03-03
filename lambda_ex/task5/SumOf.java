package lambda_ex.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOf {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(
           2, 12, 3123, 423, 13, 656, 65, 344, 54543
        ));

        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
