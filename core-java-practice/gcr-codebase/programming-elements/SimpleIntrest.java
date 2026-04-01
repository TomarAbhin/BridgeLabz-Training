import java.util.*;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int principalAmount = s.nextInt(); // principal amount
        int rate = s.nextInt(); // rate of interest
        int time = s.nextInt(); // time in years
        int simpleIntrest = (principalAmount * rate * time)/100; // Simple Interest calculation
        System.out.println("The Simple Interest is: " + simpleIntrest);
    }
    
}
