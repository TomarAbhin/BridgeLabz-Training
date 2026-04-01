import java.util.Scanner;
import java.util.regex.*;
public class ValidateALicensePlate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //take input for the plate
        System.out.print("enter license plate number: ");
        String plate = s.nextLine();

        String regex = "^[A-Z]{2}[0-9]{4}$";  //use the regex

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(plate);

        if (matcher.matches()) {
            System.out.println("Valid License Plate.");
        } else {
            System.out.println("Invalid License Plate!");
        }
    }
}


