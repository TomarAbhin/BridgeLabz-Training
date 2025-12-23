 import java.time.LocalDate;
import java.util.Scanner;
public class DateComparision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(s.next());    //input the first date

        System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(s.next());    // input the second date

        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
        }
    }
}


