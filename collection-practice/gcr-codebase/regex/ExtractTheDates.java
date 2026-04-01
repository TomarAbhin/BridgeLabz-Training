import java.util.regex.*;
public class ExtractTheDates {
    public static void main(String[] args) {
        //input the dates
        String dates = "The meetings are scheduled for 10/06/2025, 15/10/2022, and 15/01/2026.";

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b"; //use the regex

        Pattern pattern = Pattern.compile(regex);    //compile the regex pattern

        Matcher matcher = pattern.matcher(dates);   //find the match

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


