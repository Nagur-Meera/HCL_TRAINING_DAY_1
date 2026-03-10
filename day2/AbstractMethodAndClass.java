package day2;

public class AbstractMethodAndClass {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();
        circle.display();
    }
}
abstract class Shape{
    abstract void draw(); //abstract method
    //concrete method
    void display(){
        System.out.println("This is a shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}