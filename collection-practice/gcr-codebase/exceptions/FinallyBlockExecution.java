import java.util.*;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            //take the user input
            System.out.print("enter first number: ");
            int a = sc.nextInt();

            System.out.print("enter second number: ");
            int b = sc.nextInt();

            //division operation
            int ans = a/b;
            System.out.println("Result: " + ans);

        } catch (ArithmeticException e) {
            //handling division by zero
            System.out.println("Error: Cannot divide number by zero.");

        } finally {
            //this block is always executed
            System.out.println("Operation completed");
        }
    }
}
