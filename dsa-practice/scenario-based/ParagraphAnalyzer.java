import java.util.*;
public class ParagraphAnalyzer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //take input from user
        System.out.println("Enter a paragraph:");
        String paragraph = s.nextLine();

        //handle empty or space-only input
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("The paragraph is empty or contains only spaces.");
            return;
        }

        //count words
        int wordCount = countWords(paragraph);
        System.out.println("Number of words: " + wordCount);

        //find longest word
        String longestWord = findLongestWord(paragraph);
        System.out.println("Longest word: " + longestWord);

        //word replacement (case-insensitive)
        System.out.println("\nEnter word to replace:");
        String oldWord = s.nextLine();

        System.out.println("Enter replacement word:");
        String newWord = s.nextLine();

        String replacedParagraph = replaceWord(paragraph, oldWord, newWord);
        System.out.println("\nUpdated Paragraph:");
        System.out.println(replacedParagraph);

    }

    //method to count words in a paragraph
    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    //method to find the longest word
    public static String findLongestWord(String text) {
        String[] words = text.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    //method to replace word (case-insensitive)
    public static String replaceWord(String text, String oldWord, String newWord) {
        return text.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
    }
}


