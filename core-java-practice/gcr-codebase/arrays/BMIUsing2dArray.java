import java.util.*;
public class BMIUsing2dArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter  the number of persons: ");
        int num = s.nextInt();
        double[][] person = new double[num][3];
        String[] weight = new String[num];
        for (int i = 0; i < num; i++) {    // Input weight and height 
            System.out.println("\nPerson " + (i + 1));

            do {
                System.out.print("enter the weight (kg): ");
                person[i][0] = s.nextDouble();
            } while (person[i][0] <= 0);
            do {
                System.out.print("enter the height (meters): ");
                person[i][1] = s.nextDouble();
            } while (person[i][1] <= 0);
    
        }
        for (int i = 0; i < num; i++) {   // Calculate BMI and weight status
            double w= person[i][0];
        double height = person[i][1];

            person[i][2] = w / (height * height);

            if (person[i][2] < 18.5) {
                weight[i] = "Underweight";
            } else if (person[i][2] < 25) {
                weight[i] = "Normal";
            } else if (person[i][2] < 30) {
                weight[i] = "Overweight";
            } else {
                weight[i] = "Obese";
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + person[i][0] + " kg");
            System.out.println("Height: " + person[i][1] + " m");
            System.out.println("BMI: " + String.format("%.2f", person[i][2]));
            System.out.println("Status: " + weight[i]);
        }
    }
}
