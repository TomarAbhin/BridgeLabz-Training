import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); // input first number
        int b = s.nextInt(); // input second number
        int addition = a + b; // calculate sum of two numbers
        int subtraction = a - b; // calculate difference of two numbers
        int multiplication = a * b; // calculate product of two numbers
        double division = a / b; // calculate quotient of two numbers
        System.out.println("the addition,substraction,multiplication and division of "+a+" and "+b+" is: "+addition+", "+subtraction+", "+multiplication+" and "+division);
    }
    
}
