import java.util.*;
public class AllMultiplesOfANumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); // input the number
        if(num<=0&&num>100){
            System.out.println("invalid number,please enter number between 1 to 100");
        }else{
            System.out.println("all multiples of " + num + " from 1 to 100 are:");
            int i=100;
            while(i>=1){
                if(i%num==0){   // check if i is a multiple of num
                    System.out.println(i);
                }
                i--;
            }
        }
    }
}