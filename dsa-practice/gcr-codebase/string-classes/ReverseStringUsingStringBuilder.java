import java.util.*;
public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //take input for string
        System.out.print("enter a string: ");
        String str = s.nextLine();
        // reverse and display
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(); //create StringBuilder
        sb.append(input);                    // append input string
        sb.reverse();                  // reverse the string
        return sb.toString();             // convert back to String
    }
}
