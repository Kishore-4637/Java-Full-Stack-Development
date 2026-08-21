package day3;
class EcommerceProduct {
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
}
class physicalProduct extends EcommerceProduct {
    double weight;
    String dimensions;

    public physicalProduct(String name, double price, String category, double weight, String dimensions) {
        super(name, price, category);
        this.weight = weight;
        this.dimensions = dimensions;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Dimensions: " + dimensions);
    }
}
class DigitalProduct extends EcommerceProduct {
    double fileSize;
    String format;

    public DigitalProduct(String name, double price, String category, double fileSize, String format) {
        super(name, price, category);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }
    public static void main(String[] args) {
        System.out.println("E-commerce Product Information:");
        DigitalProduct product1 = new DigitalProduct("E-book", 9.99, "Books", 5.0, "PDF");
        product1.displayInfo();
        System.out.println("\nPhysical Product Information:");
        physicalProduct product2 = new physicalProduct("Laptop", 999.99, "Electronics", 2.5, "35x25x2 cm");
        product2.displayInfo();
    }
}