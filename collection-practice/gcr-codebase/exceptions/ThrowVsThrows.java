import java.util.*;
public class ThrowVsThrows {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            //take the input from user
            System.out.print("enter amount: ");
            double amount = s.nextDouble();
            System.out.print("enter rate of interest: ");
            double rate = s.nextDouble();
            System.out.print("enter number of years: ");
            int years = s.nextInt();

            //call the method
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Intrest of the amount is: " + interest);
        } catch (IllegalArgumentException e) {
            //handling propagated exception
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }

    //method that throws exception
    private static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        //using throw to raise exception
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Negative values not allowed");
        }
        //simple Interest calculation
        return (amount * rate * years) / 100;
    }
}

