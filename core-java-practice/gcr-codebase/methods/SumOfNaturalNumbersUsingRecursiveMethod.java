import java.util.*;
public class SumOfNaturalNumbersUsingRecursiveMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();   //input the number

        // Checking whether input is a natural number or not
        if (num <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }

        int sum = sumUsingRecursion(num);   // Calculating sum using recursion

        int formulaSum = sumUsingFormula(num);     // Calculating sum using formula

        System.out.println("Sum using recursive method: " + sum);
        System.out.println("Sum using formula: " + formulaSum);

        // Comparing both results
        if (sum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }

    }
    public static int sumUsingRecursion(int num) {    // Method to calculate sum using recursion
        if (num == 1) {
            return 1;   // Base case
        }
        return num + sumUsingRecursion(num - 1);
    }
    public static int sumUsingFormula(int num) {   // Method to calculate sum using formula
        return num * (num + 1) / 2;
    }
}


