package day2;
public class superAndThisKeywords{
    public static void main(String[] args) {
        child c=new child();

    }
}
class Parent{
    Parent(){
        
        this(1);
        System.out.println("parent");
    }
    Parent(int d){
        System.out.println(d);
    }
}
 class child extends Parent{
    child(){
         System.out.println("child");
    }
}

