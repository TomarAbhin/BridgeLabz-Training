import java.util.*;
public class FactorsOfANumberUsingMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt(); //input the number

        int[] ans = findFactors(num); // calling method and storing factors in a array

        System.out.print("Factors of "+num+ " are: " );
        for (int factor : ans) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calling methods for calculations
        int sum = findSumOfFactors(ans);
        long product = findProductOfFactors(ans);
        double sumOfSquares = findSumOfSquaresOfFactors(ans);

        System.out.println("Sum of factors are: " + sum);
        System.out.println("Product of factors are: " + product);
        System.out.println("Sum of squares of factors are: " + sumOfSquares);

    }

    public static int[] findFactors(int num) { // Method to find factors and return them in an array

        int count = 0;

        // First loop: count num of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize array with count
        int[] ans = new int[count];
        int idx = 0;

        // Second loop: store factors in array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                ans[idx] = i;
                idx++;
            }
        }

        return ans;
    }

    public static int findSumOfFactors(int[] ans) {   // Method to find sum of factors
        int sum = 0;
        for (int factor : ans) {
            sum += factor;   
        }
        return sum;
    }
    public static long findProductOfFactors(int[] ans) {   // Method to find product of factors
  
        long product = 1;
        for (int factor : ans) {
            product *= factor;
        }
        return product;
    }

    public static double findSumOfSquaresOfFactors(int[] ans) {   // Method to find sum of squares of factors

        double sum = 0;
        for (int factor : ans) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}


