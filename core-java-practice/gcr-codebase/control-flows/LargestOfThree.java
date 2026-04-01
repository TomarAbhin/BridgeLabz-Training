import java.util.*;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt(); // input first number
        int num2 = s.nextInt(); // input second number
        int num3 = s.nextInt(); // input third number

        if(num1>num2 && num1>num3){
            System.out.println("first number is largest: "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("second number is largest: "+num2);
        }else{
            System.out.println("third number is largest: "+num3);
        }
    }
    
}
