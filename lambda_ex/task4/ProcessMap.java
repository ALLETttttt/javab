package lambda_ex.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ProcessMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "apple", 5,
                "banana", 15,
                "cherry", 20
        );

        // option: 1
        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 10)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        // option: 2
        map.forEach((key, value) -> {
            if (value > 10) {
                System.out.println(key + "-" + value);
            }
        });
    }
}
