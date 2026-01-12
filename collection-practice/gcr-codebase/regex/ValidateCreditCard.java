import java.util.regex.*;
public class ValidateCreditCard {
    public static void main(String[] args) {
        //input credit card number
        String cardNumber = "4123456789834674";
        //use the regex
        String regex = "^(4[0-9]{15}|5[0-9]{15})$";
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(cardNumber);

        if (matcher.matches()) {
            System.out.println("Valid Credit Card Number.");
        } else {
            System.out.println("Invalid Credit Card Number!");
        }
    }
}


