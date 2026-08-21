package day3;
import java.util.*;
class Smartphone {
    String brand;
    String model;
    int storage;

    public Smartphone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
    }
    public static void main(String[] args) {
    Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 256);
    phone.displayInfo();
}


    
}
