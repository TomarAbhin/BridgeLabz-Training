import java.util.*;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt(); // principal amount
        int r = s.nextInt(); // rate of interest
        int t = s.nextInt(); // time in years
        int SI = (p * r * t) / 100; // Simple Interest calculation
        System.out.println("The Simple Interest is: " + SI);
    }
    
}
