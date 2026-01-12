import java.util.regex.*;
public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        //input string with multiple spaces
        String text = "My Name     is      Abhinav.";

        String regex = "\\s+";  //use the regex

        Pattern pattern = Pattern.compile(regex);  // Compile the regex pattern

        Matcher matcher = pattern.matcher(text);  //match the string

        String ans = matcher.replaceAll(" ");   //replace multiple spaces with a single space

        System.out.println(ans);
    }
}
    

