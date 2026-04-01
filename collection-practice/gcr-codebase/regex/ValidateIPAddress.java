import java.util.regex.*;
public class ValidateIPAddress {
    public static void main(String[] args) {
        //input IP address
        String input = "127.0.0.1";

        //regex to validate IPv4 address
        String regex ="^((25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.){3}"+ "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})$";
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //match the input
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid IP Address.");
        } else {
            System.out.println("Invalid IP Address!");
        }
    }
}


