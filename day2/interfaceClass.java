package day2;

public class interfaceClass {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();
    }
}
interface Drawable{
    void draw();
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing a circle");
    }
}



// public interface MyInterface {
//     // An abstract method (no implementation)
//     void doSomething();

//     // A static concrete method
//     public static void staticMethod() { 
//         System.out.println("Static method in the interface.");
//     }
// }

// class MyClassImpl implements MyInterface {
//     @Override
//     public void doSomething() {
//         System.out.println("Implementation of doSomething.");
//     }
// }

// // To call the static method:
// // MyClassImpl.staticMethod(); // Invalid
// // MyInterface.staticMethod(); // Valid
//diff bw interface and abstract class
//1. Abstract class can have both abstract and concrete methods, while an interface can only have abstract methods (until Java 8, after which it can have default and static methods).
//2. A class can implement multiple interfaces but can only extend one abstract class.
//interface is used to achieve abstraction and multiple inheritance in java. It is a blueprint of a class that contains only abstract methods and constants. An interface cannot be instantiated, but it can be implemented by classes or extended by other interfaces.