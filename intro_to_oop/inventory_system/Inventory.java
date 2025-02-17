package intro_to_oop.inventory_system;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    public Inventory(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void getProductList() {
        for (Product product: this.productList) {
            System.out.println(product.toString());
        }
    }
}
