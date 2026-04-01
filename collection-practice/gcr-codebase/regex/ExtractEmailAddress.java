import java.util.regex.*;
public class ExtractEmailAddress {
    public static void main(String[] args) {
        String mail = "Contact us at Abhinav@gmail.com and gla@ac.in";  //enter the mails

        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"; //use the regex

        Pattern pattern = Pattern.compile(regex); //compile the regex pattern
        Matcher matcher = pattern.matcher(mail);  //find matches

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


