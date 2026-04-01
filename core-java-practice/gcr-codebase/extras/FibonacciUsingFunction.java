import java.util.*;
public class FibonacciUsingFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of term: ");
        int term = s.nextInt();
        printFibonacci(term);
    }
    public static void printFibonacci(int n) {    // Method to calculate and print Fibonacci sequence

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

