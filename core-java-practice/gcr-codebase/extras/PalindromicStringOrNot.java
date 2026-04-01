import java.util.*;
public class PalindromicStringOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = s.nextLine();   //st the string
        st = st.toLowerCase();  // Convert to lowercase to ignore case differences
        boolean isPalindrome = true;
        // Check characters from start and end
        int start = 0;
        int end = st.length() - 1;

        while (start < end) {
            if (st.charAt(start) != st.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }
    }
}


