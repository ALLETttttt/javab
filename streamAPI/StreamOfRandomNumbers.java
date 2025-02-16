package streamAPI;

import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int result = IntStream.generate(() -> random.nextInt(500))
                .filter(n -> n > 100 && n % 5 == 0)
                .findFirst()
                .orElse(-1);

        Optional<Integer> res = Stream.generate(() -> random.nextInt(500))
                        .filter(n -> n > 100 && n % 5 == 0)
                                .findFirst();

        res.ifPresent(System.out::println);

        System.out.println(result);
    }
}
