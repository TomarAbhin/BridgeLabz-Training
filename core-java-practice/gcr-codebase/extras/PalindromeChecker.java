import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        String st = getInput();  // input using the method

        boolean ans = isPalindrome(st); // calling method to check palindrome or not
        displayResult(st, ans);
    }

    public static String getInput() {   // Method to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        return sc.nextLine();
    }
    public static boolean isPalindrome(String st) {    // Method to check if string is palindrome
        st = st.toLowerCase();

        int start = 0;
        int end = st.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (st.charAt(start) != st.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to display the result
    public static void displayResult(String st, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + st + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + st + "\" is not a Palindrome.");
        }
    }
}


