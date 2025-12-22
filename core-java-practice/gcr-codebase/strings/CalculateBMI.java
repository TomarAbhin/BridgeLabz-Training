import java.util.*;
public class CalculateBMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 10;   // no. of persons whose bmi is to be calculated
        double[][] personData = new double[n][2];  
        for (int i = 0; i < n; i++) {
            System.out.print("enter the weight of person " + (i + 1) + " in kg : ");
            personData[i][0] = s.nextDouble();
            System.out.print("enter the height  of person " + (i + 1) + " in cm : ");
            personData[i][1] = s.nextDouble();
        }

        String[][] ans = prepareData(personData);
        displayResult(ans);
    }
    public static String[][] prepareData(double[][] personData) {        // Calculate BMI and status for each person
        String[][] ans = new String[personData.length][4];
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInCm = personData[i][1];
            double heightInM = heightInCm / 100;              // cm to meter

            double bmi = calculateBMI(weight, heightInM);
            String status = getBMIStatus(bmi);
            ans[i][0] = String.valueOf(heightInCm);
            ans[i][1] = String.valueOf(weight);
            ans[i][2] = String.format("%.2f", bmi);
            ans[i][3] = status;
        }
        return ans;
    }

    
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);   // BMI formula
    }
    public static String getBMIStatus(double bmi) {       //  method to Determine BMI status
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
    public static void displayResult(String[][] personData) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < personData.length; i++) {
            System.out.println(personData[i][0] + "\t\t" + personData[i][1] + "\t\t" + personData[i][2] + "\t" + personData[i][3]);
        }
    }
}


