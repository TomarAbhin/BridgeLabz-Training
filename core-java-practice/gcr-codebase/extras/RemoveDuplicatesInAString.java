import java.util.*;
public class RemoveDuplicatesInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = s.nextLine();  //st the string
        String ans = "";

        for (int i = 0; i < st.length(); i++) {   // Loop through each character
            char ch = st.charAt(i);

            // Check if character is already present in string
            if (ans.indexOf(ch) == -1) {
                ans = ans + ch;
            }
        }
        System.out.println("String after removing duplicates: " + ans);
    }
}

