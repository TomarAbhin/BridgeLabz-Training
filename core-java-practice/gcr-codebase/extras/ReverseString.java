import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = s.nextLine();   //input the string
        String reversed = "";

        for (int i = st.length() - 1; i >= 0; i--) {   // Loop from last character to first
            reversed = reversed + st.charAt(i);
        }
    
        System.out.println("Reversed string is: " + reversed);
    }
}
