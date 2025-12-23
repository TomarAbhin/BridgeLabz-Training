import java.util.*;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = s.nextInt();   // input the num

        boolean isPrime = checkPrime(num);  //calling method to get the result

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }

    public static boolean checkPrime(int num) {   // Method to check whether a num is prime or not

        if (num <= 1) {   // numbers less than or equal to 1 are not prime
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {     // Check divisibility from 2 to num/2
            if (num % i == 0) {     // If divisible, not prime
                return false;
            }
        }
        return true;
    }
}


