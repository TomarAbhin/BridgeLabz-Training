import java.util.*;
public class OperationsOnFactorsOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = s.nextInt();   //input the number

        // Finding factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // calling methods for operations on factors
        int greatestFactor = findGreatestFactor(factors);
        int sum = findSumOfFactors(factors);
        long product = findProductOfFactors(factors);
        double productOfCubes = findProductOfCubes(factors);

        System.out.println("Greatest factor: " + greatestFactor);
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Product of cubes of factors: " + productOfCubes);

    }

    // Method to find factors of a number
    public static int[] findFactors(int number) {

        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find greatest factor
    public static int findGreatestFactor(int[] factors) {

        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {

        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cubes of factors
    public static double findProductOfCubes(int[] factors) {

        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}



