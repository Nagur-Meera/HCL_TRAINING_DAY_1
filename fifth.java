//simple calculator

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        char operator=sc.next().charAt(0);
        int result=0;
        
        switch(operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if(num2!=0){
                    result=num1/num2;
                }
                else{
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        
        System.out.println("Result: "+result);
    }
}
