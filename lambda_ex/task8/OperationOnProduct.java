package lambda_ex.task8;

import streamAPI.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class OperationOnProduct {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Product(1, "Laptop", "Electronics", 1200.50),
                new Product(2, "Smartphone", "Electronics", 800.00),
                new Product(3, "Headphones", "Electronics", 150.75),
                new Product(4, "T-shirt", "Clothing", 25.99),
                new Product(5, "Jeans", "Clothing", 49.99),
                new Product(6, "Washing Machine", "Home Appliances", 550.00),
                new Product(7, "Microwave Oven", "Home Appliances", 220.00),
                new Product(8, "Sneakers", "Footwear", 89.99),
                new Product(9, "Gaming Console", "Electronics", 500.00),
                new Product(10, "Backpack", "Accessories", 35.00)
        ));

        productList.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .forEach(product -> System.out.println(product));

        OptionalDouble average = productList.stream()
                .mapToDouble(product -> product.getPrice())
                .average();

        if (average.isPresent()) {
            System.out.printf("Average: %.2f%n", average.getAsDouble());
        } else {
            System.out.println("No values");
        }

        List<String> productNamesList = productList.stream()
                .map(product -> product.getName())
                .collect(Collectors.toList());
        System.out.println(productNamesList);

        productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        productList.forEach(System.out::println);
    }
}
