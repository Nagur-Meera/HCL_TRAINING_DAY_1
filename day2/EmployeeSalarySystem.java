package day2;

public class EmployeeSalarySystem{
    public static void main(String[] args) {
        Employee emp1=new Employee("meera",20,10.0);
        emp1.display();
    }
}
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    
}
class Employee extends Person{
    double salary;
    Employee(String name,int age, double salary){
        super(name,age);
        this.salary=salary;
    }
    void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nsalary: "+salary);
    }
}