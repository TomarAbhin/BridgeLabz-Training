import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // Check if the n is an Armstrong n using a method 
        if (amstrong(n)) {
            System.out.println(n + " is  amstrong number");
        } else {
            System.out.println(n + " is not  amstrong number");
        }
    }
    
    public static boolean amstrong(int n) {
        // Convert the n to a string to easily get the n of digits
        String st = Integer.toString(n);
        int num = st.length(); // Number of digits
        
        // Initialize sum to 0
        int sum = 0;
        
        // Loop through each digit
        for (char digitChar : st.toCharArray()) {
            int digit = digitChar - '0'; // Convert char to int
            // Add the digit raised to the power of num to the sum
            sum += Math.pow(digit, num);
        }
        
        // Check if the sum equals the original n
        return sum == n;
    }
}

