package day2;

public class vararg_method {
    //vararg method
    static void sum(int... numbers){    
        int sum=0;    
        for(int i:numbers){    
            sum+=i;    
        }    
        System.out.println("Sum: "+sum);    
    }
    public static void main(String[] args) {
        sum(10,20);        // 30
        sum(10,20,30);     // 60
        sum(10,20,30,40);  // 100
    }
}
