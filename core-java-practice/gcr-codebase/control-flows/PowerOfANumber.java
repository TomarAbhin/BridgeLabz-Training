import java.util.*;
public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); // input the number
        int power=s.nextInt(); // input the power
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*num;
        }
        System.out.println("" + num + " raised to the power " + power + " is: " + result);
    }
}