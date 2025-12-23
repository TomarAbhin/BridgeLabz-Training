import java.util.*;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = s.nextLine();   //input the string
        int vowelCount = 0;
        int consonantCount = 0;
        st = st.toLowerCase();    //Convert string to lowercase for easy comparison
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'a' && ch <= 'z') {      // Check if character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {    // Check for vowel
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount+" and number of consonants are: "+consonantCount);

    }
}

