import java.util.*;
public class CountDownForRocketLaunch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt(); // input the starting number for countdown
        while(n>=1){
            System.out.println(n);
            n--;
        }
    }
    
}
