import java.util.*;
public class BMIOfAPerson {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double weight=s.nextDouble(); //input weight in kg
        int height=s.nextInt(); //input height in cm
        double heightInMeters=height/100.0; //convert height to meters
        double bmi=weight/(heightInMeters*heightInMeters); //formula to calculate BMI
        if(bmi<=18.4){
            System.out.println("underweight");
        }else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("normal weight");
        }else if(bmi>=25 && bmi<=39.9){
            System.out.println("overweight");
        }else{
            System.out.println("obese");
        }
    }
}
