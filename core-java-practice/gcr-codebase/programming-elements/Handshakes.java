import java.util.*;
public class Handshakes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // number of people
        int handshakes = n * (n - 1) / 2; //  formula to calculate the number of handshakes
        System.out.println("total handshakes among " + n + " people is: " + handshakes);
    }
    
}
