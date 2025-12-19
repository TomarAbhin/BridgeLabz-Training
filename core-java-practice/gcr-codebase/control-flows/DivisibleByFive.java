// package core-java-practice.gcr-codebase.control-flows;
import java.util.*;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=  s.nextInt(); // input the number
        if(a%5==0){   
            // check divisibility by 5
            System.out.println("the number : "+a+" is divisible by 5");
        }
        else{
            System.out.println("the number : "+a+" is not divisible by 5");
        }
    }
    
}
