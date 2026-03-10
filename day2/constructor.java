package day2;
public class constructor {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        System.out.println("Laptop 1: Brand - " + laptop1.getBrand() + ", RAM - " + laptop1.getRam() + "GB");
        
        Laptop laptop2 = new Laptop("Dell", 16);
        System.out.println("Laptop 2: Brand - " + laptop2.getBrand() + ", RAM - " + laptop2.getRam() + "GB");
        
        Laptop laptop3 = new Laptop("HP");
        System.out.println("Laptop 3: Brand - " + laptop3.getBrand() + ", RAM - " + laptop3.getRam() + "GB");
    }
}
class Laptop {
    String brand;
    int ram;
    
    // constructors
    public Laptop() {
        this.brand = "Unknown";
        this.ram = 0;
    }
    public Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }
    public Laptop(String brand) {
        this.brand = brand;
        this.ram = 0;
    }
    public String getBrand() {
        return brand;
    }
    public int getRam() {
        return ram;
    }
}

