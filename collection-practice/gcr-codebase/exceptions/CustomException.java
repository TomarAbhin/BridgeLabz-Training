import java.util.*;

//custom Exception class
class InvalidAgeException extends Exception {
    //constructor with custom message
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age = s.nextInt();
        try {
            validateAge(age);
            System.out.println("Age is above or equal to 18,Access granted! ");
        } catch (InvalidAgeException e) {
            //message
            System.out.println("Age must be 18 or above");
        }
    }

    //method that validates age and throws custom exception
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age");
        }
    }
}

