package day1;
import java.util.Scanner;
//grade of student
public class fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of student:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grade: A");
        }
        else if(marks>=75){
            System.out.println("Grade: B");
        }
        else if(marks>=60){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: Fail");
        }
        
    }
}
