import java.util.*;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = s.nextLine();
        char ans = findCharacter(st);
        if (ans != '\0'){
            System.out.println("First non-repeating character is: " + ans);
        }else{
            System.out.println("No non-repeating character found");
        }
    }

    
    public static char findCharacter(String st) {     // Find first non-repeating character using frequency array
        int[] freq = new int[256];   // ASCII character frequency
        for (int i = 0; i < st.length(); i++) {
            freq[st.charAt(i)]++;
        }
        for (int i = 0; i < st.length(); i++) {
            if (freq[st.charAt(i)] == 1)
                return st.charAt(i);
        }

        return '\0';   // indicates no non-repeating character
    }
}


