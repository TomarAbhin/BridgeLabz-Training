import java.util.*;
public class NumberChecker1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        if (isPerfectNumber(number)) {    // Check Perfect number
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }

        if (isAbundantNumber(number)) {     // Check Abundant number
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        if (isDeficientNumber(number)) {     // Check Deficient number
            System.out.println(number + " is a Deficient number.");
        } else {
            System.out.println(number + " is not a Deficient number.");
        }

        if (isStrongNumber(number)) {   // Check Strong number
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }

    public static int sumOfProperDivisors(int number) {   // Method to calculate sum of proper divisors
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {   // Method to check Perfect number
        return number > 0 && sumOfProperDivisors(number) == number;
    }
    public static boolean isAbundantNumber(int number) {  // Method to check Abundant number
        return number > 0 && sumOfProperDivisors(number) > number;
    }
    public static boolean isDeficientNumber(int number) {   // Method to check Deficient number
        return number > 0 && sumOfProperDivisors(number) < number;
    }
    public static boolean isStrongNumber(int number) {   // Method to check Strong number
        int sum = 0;     
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }
    public static int factorial(int n) {   // Method to calculate factorial of a digit
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}