import java.util.*;
public class FactorialOfANumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // input the number
        int factorial = 1; // initialize factorial to 1
        int i = 1; // initialize counter to 1
        while (i <= n) { // calculate factorial using while loop
            factorial *= i; // multiply the current number to factorial
            i++; // increase the counter
        }
        System.out.println("factorial of number " + n + " is: " + factorial);
    }
    
}
