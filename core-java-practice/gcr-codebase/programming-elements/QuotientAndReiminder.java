import java.util.*;
public class QuotientAndReiminder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //input first number 
        int m = s.nextInt(); // input second number
        int quotient = n / m; // formula for calculating quotient
        int remainder = n % m; // formula for calculating remainder
        System.out.println("the quotient and remainder of "+n+" and "+m+" is: "+quotient+" and "+remainder);
    }
    
}
