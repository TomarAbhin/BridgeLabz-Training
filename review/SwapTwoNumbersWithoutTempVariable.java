import java.util.*;
public class SwapTwoNumbersWithoutTempVariable {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1=s.nextInt();
        System.out.print("enter second number: ");
        int num2=s.nextInt();
        System.out.println("Values Before Swapping: "+num1+" and "+num2);
        swap(num1,num2);
    }
    public static void swap(int num1,int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Values After Swapping: "+ num1 +" and "+ num2);

    }
}
