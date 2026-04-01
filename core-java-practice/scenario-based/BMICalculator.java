import java.util.*;
public class BMICalculator {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter weight in kg:");
        double weight=s.nextDouble();
        System.out.println("enter height in meters:");
        double height=s.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("Your BMI is: "+bmi);
        if(bmi<18.5){
            System.out.println("You are underweight.");
        }
        else if(bmi>=18.5 && bmi<24.9){
            System.out.println("You have a normal weight.");
        }
        else if(bmi>=25 && bmi<29.9){
            System.out.println("You are overweight.");
        }
        else{
            System.out.println("You are obese.");
        }
    }
}
