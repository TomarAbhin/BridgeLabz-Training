import java.util.*;
public class ValidateAUserName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // input the user name
        System.out.print("enter username: ");
        String username = s.nextLine();

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";   //use the regex
        //check to validate
        if (username.matches(regex)) {   
            System.out.println("Valid Username.");
        } else {
            System.out.println("Invalid Username!");
        }
    }
}


