import java.util.*;
public class BasePowerCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base= s.nextInt(); // base value
        int power = s.nextInt(); // exponent value
        int ans = 1;
        for (int i = 0; i < power; i++) {
            ans *= base; 
        }
        System.out.println("the ans is:"+ ans);
    }
    
}
