import java.util.*;
public class FactorialOfANumberUsingForLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // input the number
        int factorial = 1; // initialize factorial to 1
        for (int i = 1; i <= n; i++) { // calculate factorial using for loop
            factorial *= i; // multiply the current number to factorial
        }
        System.out.println("factorial of number " + n + " is: " + factorial);
    }
}
