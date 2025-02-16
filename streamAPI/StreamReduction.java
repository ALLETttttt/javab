package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamReduction {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Streams", "Are", "Cool"));

        String concatenatedString = list.stream()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("");

        System.out.println(concatenatedString);
    }
}
