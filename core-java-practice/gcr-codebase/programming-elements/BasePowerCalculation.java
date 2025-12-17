import java.util.*;
public class BasePowerCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt(); // base value
        int p = s.nextInt(); // exponent value
        int ans = 1;
        for (int i = 0; i < p; i++) {
            ans *= b; 
        }
        System.out.println("the ans is:"+ ans);
    }
    
}
