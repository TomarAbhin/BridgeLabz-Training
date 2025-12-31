import java.util.*;
public class ConcatenateStringsUsingStringBuffer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // take array size
        System.out.print("Enter number of strings: ");
        int n = s.nextInt();
        s.nextLine(); // consume newline
        String[] arr = new String[n];
        // take string inputs
        for (int i = 0; i < n; i++) {
            System.out.print("enter string " + (i + 1) + ": ");
            arr[i] = s.nextLine();
        }
        //concatenate and display result
        String result = concatenateStrings(arr);
        System.out.println("Concatenated String: " + result);
    }

    //method to concatenate strings using StringBuffer
    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();   //create StringBuffer
        for (String str : arr) {
            sb.append(str);           //append each string
        }
        return sb.toString();                  //return final string
    }

    
}


