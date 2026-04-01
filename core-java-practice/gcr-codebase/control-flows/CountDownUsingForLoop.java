import java.util.*;
public class CountDownUsingForLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(); // input the starting number for countdown
        for(int i=n; i>=0; i--){ // countdown from n to 0
            System.out.println(i);
        }
    }
}