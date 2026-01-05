class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above. Current Age: " + age);
        }
        System.out.println("Valid age: " + age);
    }
    public static void main(String[] args) {
        try {
            validateAge(19); 
            validateAge(17); 
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }finally{
            System.out.println("Age Must be 18 years old.");
        }
        
       
    }
}
