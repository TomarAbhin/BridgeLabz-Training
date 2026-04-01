import java.util.*;
public class SentenceFormatter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //take input from user
        System.out.println("Enter a paragraph:");
        String input = s.nextLine();

        String formattedText = formatSentence(input);

        System.out.println("\nFormatted Text:");
        System.out.println(formattedText);
    }

    //method to format the sentence 
    public static String formatSentence(String paragraph) {
        //trim extra spaces and reduce multiple spaces to one
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        StringBuilder ans = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            //capitalize first letter of sentence
            if (capitalizeNext && Character.isLetter(ch)) {
                ans.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                ans.append(ch);
            }

            //after punctuation, ensure space and capitalize next letter
            if (ch == '.' || ch == '?' || ch == '!') {
                if (i + 1 < paragraph.length() && paragraph.charAt(i + 1) != ' ') {
                    ans.append(' ');
                }
                capitalizeNext = true;
            }
        }

        return ans.toString();
    }
}
