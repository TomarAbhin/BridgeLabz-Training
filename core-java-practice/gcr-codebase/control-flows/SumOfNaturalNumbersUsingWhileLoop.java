import java.util.*;
public class SumOfNaturalNumbersUsingWhileLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(); // input the natural number 
        int sum=0; // initialize sum to 0
        int i=1; // starting from the first natural number
        int totalUsingFormula = n*(n + 1)/2; // sum using formula n(n+1)/2
        while (i <= n) { // calculate sum using while loop
            sum += i; // add the current number to sum
            i++; // move to the next natural number
        }
        if(sum == totalUsingFormula) {
            System.out.println("sum calulated wusing loop and formula are same: " + sum);
        } else {
            System.out.println("sum calculated using loop and formula are different.");
        }
    }
    
}
