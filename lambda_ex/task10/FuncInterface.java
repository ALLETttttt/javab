package lambda_ex.task10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncInterface {
    public static void main(String[] args) {
        // task 1
        StringOperation stringOperation = (str) ->
             new StringBuilder(str).reverse().toString();

        String original = "Alaidar Bakdaulet";
        System.out.println(stringOperation.execute(original));

        // task 2
        NumericCalculation numericCalculation = (a, b) -> a + b;
        System.out.println(numericCalculation.compute(4, 65));

        // task 3
        CheckCondition checkCondition = n -> n % 2 == 0;
        System.out.println(checkCondition.test(3));
        System.out.println(checkCondition.test(664));

        // task 4
        DataProcessor<String> dataProcessor = data -> data.stream()
                .filter(item -> item != null)
                .collect(Collectors.toList());

        List<String> testData = Arrays.asList("apple", null, "banana", null, "cherry", "date", null);
        System.out.println("Original list: " + testData);
        System.out.println(dataProcessor.process(testData));
    }
}
