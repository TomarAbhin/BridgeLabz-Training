import java.util.*;
public class SumOfNaturalNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();  //input the number

        int ans = calculateSum(num);     // Calling method to calculate sum
        System.out.println("The sum of first " + num + " natural numbers is: " + ans);

    }
    public static int calculateSum(int n) {   // Method to calculate sum of n natural numbers 

        int ans = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            ans = ans + i;
        }

        return ans;
    }
}

