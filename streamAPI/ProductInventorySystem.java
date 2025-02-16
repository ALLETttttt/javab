package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductInventorySystem {
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

        Map<String, Double> totalValueOfCategory = productList.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.summingDouble(Product::getPrice)
                ));

        totalValueOfCategory.forEach((category, totalValue) -> {
            System.out.println(category + "=" + String.format("%.2f", totalValue));
        });
    }
}
