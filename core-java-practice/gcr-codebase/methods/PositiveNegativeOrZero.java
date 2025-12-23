import java.util.*;
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = s.nextInt();

        int ans = checkNumber(number);    // Calling method to check the number
        if (ans == 1) {
            System.out.println("the number is Positive");
        } else if (ans == -1) {
            System.out.println("the number is Negative");
        } else {
            System.out.println("the number is Zero");
        }

    }

    public static int checkNumber(int num) {    // Method to check whether number is positive, negative or zero

        if (num>0) {
            return 1;     // Positive number
        } else if (num<0) {
            return -1;    // Negative number
        } else {
            return 0;     // Zero
        }
    }
}


