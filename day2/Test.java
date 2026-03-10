package day2;

public class Test {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.sound();
        //Dog dog1=new Animal(); //compile time error: incompatible types: Animal cannot be converted to Dog
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
//concept : using parent as base address type and assigning child class object to it is called upcasting. It is used to achieve runtime polymorphism.
