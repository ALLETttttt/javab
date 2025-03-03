package lambda_ex.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransformCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
                "qwcqc", "wevcwcwec2", "wec232", "2e2efcwedq43",
                "23f23f23f", "23f2f3qwvacs", "bakdsaulet"
        ));

        list.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));
    }
}
