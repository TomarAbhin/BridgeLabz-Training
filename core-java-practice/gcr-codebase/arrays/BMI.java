import java.util.*;
public class BMI {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of persons: ");
        int n = s.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {      // Input height and weight
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            weight[i] = s.nextDouble();
            System.out.print("Enter height (meters): ");
            height[i] = s.nextDouble();
        }
        for (int i = 0; i < n; i++) {     // Calculate BMI and status
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person "+ (i + 1));
            System.out.println("Height: "+ height[i] + " m");
            System.out.println("Weight: "+ weight[i] + " kg");
            System.out.println("BMI: " +bmi[i]);
            System.out.println("Status: "+status[i]);
        }
    }
}
