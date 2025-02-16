package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedGrouping {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Alice", 25, "New York"),
                new Person("Bob", 30, "New York"),
                new Person("Charlie", 28, "Los Angeles"),
                new Person("David", 35, "Los Angeles"),
                new Person("Eve", 22, "Chicago"),
                new Person("Frank", 40, "Chicago"),
                new Person("Grace", 30, "San Francisco"),
                new Person("Hank", 45, "San Francisco")
        );

        Map<String, Double> averageAgeByCity = personList.stream()
                .collect(Collectors.groupingBy(
                        Person::getCityName,
                        Collectors.averagingInt(Person::getAge)
                ));

        System.out.println(averageAgeByCity);
    }
}
