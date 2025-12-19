import java.util.*;
public class SumOfNaturalNumbersUsingForLoop {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(); // input the natural number 
        int sum=0; // initialize sum to 0
        int totalUsingFormula = n*(n + 1)/2; // sum using formula n(n+1)/2
        for (int i = 1; i <= n; i++) { // calculate sum using for loop
            sum += i; // add the current number to sum
        }
        if(sum == totalUsingFormula) {
            System.out.println("sum calulated wusing loop and formula are same: " + sum);
        } else {
            System.out.println("sum calculated using loop and formula are different.");
        }
    }
}
