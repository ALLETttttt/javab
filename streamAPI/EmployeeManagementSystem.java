package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "Alice", "IT", 75000),
                new Employee(2, "Bob", "IT", 80000),
                new Employee(3, "Charlie", "HR", 60000),
                new Employee(4, "David", "HR", 65000),
                new Employee(5, "Eve", "Finance", 90000),
                new Employee(6, "Frank", "Finance", 85000),
                new Employee(7, "Grace", "Marketing", 70000),
                new Employee(8, "Hank", "Marketing", 72000)
        ));

        Map<String, Double> averageSalary = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(averageSalary);
    }
}
