import java.util.*;
public class NumberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num = s.nextInt(); // input the number
        if(num>0){ //number is positive
            System.out.println("the number is positive: "+num);
        }else if(num<0){ //number is negative
            System.out.println("the number is negative: "+num);
        }else{ //number is zero
            System.out.println("the number is zero: "+num);
        }
    }
}