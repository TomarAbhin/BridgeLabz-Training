package string_length;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int maxLimit = 50;

        Function<String, Integer> lengthFunction = msg -> msg.length();

        checkMessage("Hello Java", maxLimit, lengthFunction);
        checkMessage("This is a very long message that will definitely cross the character limit", 
                     maxLimit, lengthFunction);
    }

    static void checkMessage(String message, int limit,Function<String, Integer> function) {

        int length = function.apply(message);

        if (length > limit) {
            System.out.println("Message too long (" + length + " characters)");
        } else {
            System.out.println("Message accepted (" + length + " characters)");
        }
    }
}

