import java.util.*;
public class LongestWordInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String st = s.nextLine();  //input the string

        String[] words = st.split(" ");  // split the string
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {   // iterate through words to find the longest one
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest word in the string is: " + longestWord);

    }
}

