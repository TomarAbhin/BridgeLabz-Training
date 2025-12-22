import java.util.*;
public class TrimAString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter the string:  ");
        String st = s.nextLine();

        int[] indexes = findTrimIdx(st);                 
        String ans = substringUsingCharAt(st, indexes[0], indexes[1]);
        String ansUsingFunction = st.trim();                  

        boolean result = compareUsingCharAt(ans, ansUsingFunction);

        System.out.println("string trimmed using user-defined method(): [" + ans + "]");
        System.out.println("string trimmed using built-in function():  [" + ansUsingFunction + "]");

        if (result){
            System.out.println("Both results are equal");
        }else{
            System.out.println("Both results are not equal");
        }
        
    }

    public static int[] findTrimIdx(String st) {              // Find startIdx and endIdx index after trimming spaces

        int startIdx = 0;
        int endIdx = st.length() - 1;

        while (startIdx <= endIdx && st.charAt(startIdx) == ' ')
            startIdx++;

        while (endIdx >= startIdx && st.charAt(endIdx) == ' ')
            endIdx--;

        return new int[]{startIdx, endIdx + 1};   // endIdx + 1 for substring logic
    }

    
    public static String substringUsingCharAt(String st, int startIdx, int endIdx) {

        String result = "";
        for (int i = startIdx; i < endIdx; i++) {
            result += st.charAt(i);            // Create substring using charAt()
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {     

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))       // Compare two strings using charAt()
                return false;
        }
        return true;
    }
}


