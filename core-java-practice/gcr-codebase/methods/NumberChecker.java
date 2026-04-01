import java.util.*;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Store digits in array
        int[] digits = storeDigits(number);
        System.out.println("Digits in array: " + Arrays.toString(digits));

        // Reverse digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        // Check if palindrome
        boolean isPalindrome = compareArrays(digits, reversedDigits);
        if (isPalindrome) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is not a Palindrome number.");
        }

        // Check if Duck number
        boolean isDuck = isDuckNumber(digits);
        if (isDuck) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }
    }

    
    public static int countDigits(int number) {   // Method to count digits in number
        if (number == 0) return 1;
        int count = 0;
        int n = Math.abs(number);
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int number) {   // Method to store digits in an array
        int n = Math.abs(number);
        int length = countDigits(n);
        int[] digits = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }
    public static int[] reverseArray(int[] arr) {  // Method to reverse an array
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    public static boolean compareArrays(int[] arr1, int[] arr2) {   // Method to compare two arrays
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static boolean isDuckNumber(int[] digits) {  // Method to check if a number is a Duck number
        // Duck number: has a non-zero digit
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}


