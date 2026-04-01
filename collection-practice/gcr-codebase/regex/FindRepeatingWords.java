import java.util.regex.*;
public class FindRepeatingWords {
    public static void main(String[] args) {
        //input the sentence
        String text = "My name name is Abhinav.This is is a sample sample text.";
        //use the regex
        String regex = "\\b(\\w+)\\s+\\1\\b";
        // Compile regex pattern 
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        //create matcher for the sentence
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
