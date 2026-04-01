import java.util.*;
public class PowerOfANumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); // input the number
        int power=s.nextInt(); // input the power
        int ans=1;
        int i=1;
        while(i<=power){
            ans=ans*num;
            i++;
        }
        System.out.println("" + num + " raised to the power " + power + " is: " + ans);
    }
}