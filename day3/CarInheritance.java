package day3;
class Vehicle {
    String brand;
    int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}
    class Car extends Vehicle {
        int numDoors;
        public Car(String brand, int speed, int numDoors) {
            super(brand, speed);
            this.numDoors = numDoors;
        }
        public void displayInfo() {
            System.out.println("Car Brand: " + brand);
            System.out.println("Speed: " + speed + " km/h");
            System.out.println("Number of Doors: " + numDoors);
        }
    }
    public class CarInheritance {
        public static void main(String[] args) {
            Car car = new Car("Toyota", 180, 4);
            car.displayInfo();
        }
    }
