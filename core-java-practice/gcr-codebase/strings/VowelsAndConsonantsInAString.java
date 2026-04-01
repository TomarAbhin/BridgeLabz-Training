import java.util.*;
public class VowelsAndConsonantsInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);              
        System.out.print("Enter the string: ");
        String st = s.nextLine();              // input the string

        int[] ans = findVowelsAndConsonants(st);        // Call method to get counts
        System.out.println("Vowels in string are: " + ans[0]);  
        System.out.println("Consonants in string are: " + ans[1]); 
    }
    public static String checkVowelOrConsonant(char ch) {

        if (ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch + 32);  // Convert uppercase to lowercase using ASCII
        }
        if (ch >= 'a' && ch <= 'z') {                   
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";                              // Return vowel
            } else {
                return "Consonant";                 // Return consonant
            }
        }

        return "Not Valid alphabet";                                  // If not an alphabet
    }
    public static int[] findVowelsAndConsonants(String st) {    // Method to count vowels and consonants in a string

        int vowels = 0;                                  // Counter for vowels
        int consonants = 0;                       // Counter for consonants

        for (int i = 0; i < st.length(); i++) {        
            char ch = st.charAt(i);             
            String ans = checkVowelOrConsonant(ch);         // Check character type

            if (ans.equals("Vowel")){
                vowels++;      // Increment the vowel count
            }            
            else if (ans.equals("Consonant")){
                consonants++;   // Increment the consonant count
            } 
        }

        return new int[]{vowels, consonants};           // Return counts as array
    }
}


