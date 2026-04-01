import java.util.*;
public class SimpleIntrestUsingMethods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //take user input for amount,time and rate of intrest
        System.out.print("enter the principal amount: ");
        double principal = s.nextDouble();

        System.out.print("enter the rate of intrest: ");
        double rate = s.nextDouble();

        System.out.print("enter time: ");
        double time = s.nextDouble();
        double ans = calculateSimpleInterest(principal, rate, time);    // calling the method 

        System.out.println("The Simple Interest is: " + ans );         
                
    }
    
    public static double calculateSimpleInterest(double principal, double rate, double time) {    // Method to calculate Simple Interest
        return (principal * rate * time) / 100; 
    }
}


