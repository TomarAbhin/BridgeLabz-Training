import java.util.*;
public class ConvertToUpperCase {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string:"); 
        String st=s.nextLine();  // input the string in lowercase
        String ans = convertToUppercase(st); //calling the method and passing string to it
        String ansUsingFunction = st.toUpperCase();  // using built in function to convert to upper case
        boolean result = compareUsingCharAt(ans, ansUsingFunction);    //comparing both the strinngs
        System.out.println("string converted to upper case is: "+ans);
        if (result) {
            System.out.println("result from both methods are same.");
        } else {
            System.out.println("results from both methods are not same.");
        }
    }
    public static String convertToUppercase(String st) {    // method to convert to upper case
        String result = "";    // initialize the empty string
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'a' && ch <= 'z') {   // Check if character is lowercase (a–z)
                ch = (char) (ch - 32);      // ASCII conversion
            }
            result+=ch;
        }

        return result;
    }
    public static boolean compareUsingCharAt(String st1, String st2) {     // method for comparing two strings
        if (st1.length() != st2.length()) {
            return false;
        }

        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) != st2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
