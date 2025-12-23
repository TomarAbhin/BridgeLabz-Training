import java.util.*;
public class LeapYearUsingMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = s.nextInt();     // input the year
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year 1582 or later.");
            return;
        }

        boolean isLeap = isLeapYear(year);  // Calling method to check leap year
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
    public static boolean isLeapYear(int year) {  // Method to check leap year using given conditions

        // Condition a: divisible by 4 and not divisible by 100
        // Condition b: divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }
}

