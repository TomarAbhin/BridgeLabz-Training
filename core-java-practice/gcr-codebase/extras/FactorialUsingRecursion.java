import java.util.*;
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int num = getInput();   //get the input

        long factorial = calculateFactorial(num);  // Calculate factorial using recursion

        displayResult(num, factorial);
    }

    public static int getInput() {  // Method to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return sc.nextInt();
    }

    public static long calculateFactorial(int n) {   // Recursive method to calculate factorial

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * calculateFactorial(n - 1);
    }

    public static void displayResult(int num, long factorial) {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}


