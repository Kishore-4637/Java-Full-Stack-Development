package day3;
import java.util.*;
public class EcommerceProduct {
    String name;
    double price;
    String category;

    public EcommerceProduct(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
    }
    public static void main(String[] args) {
    EcommerceProduct product = new EcommerceProduct("Samsung Galaxy S24", 999.99, "Smartphones");
    product.displayInfo();
}
}
