import java.util.*;
public class QuotientAndRemainderUsingMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();      //input the number
        System.out.print("Enter the divisor: ");
        int divisor = s.nextInt();  //input the divisor

        int[] ans = findRemainderAndQuotient(num, divisor);     // Calling method to get quotient and remainder

        System.out.println("Quotient is: " + ans[0]);
        System.out.println("Remainder is: " + ans[1]);

    }

    public static int[] findRemainderAndQuotient(int num, int divisor) {    // Method to find quotient and remainder

        int quotient = num / divisor;   // Division operator to calculate quotient
        int remainder = num % divisor;  // Modulus operator to calculate remainder

        // Returning ans as array
        return new int[]{quotient, remainder};
    }
}


