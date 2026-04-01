import java.util.*;
public class PrimeNumberOrNot {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); //input number to check prime or not
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("the number "+num+" is a prime number.");
        }else{
            System.out.println("the number "+num+" is not a prime number.");
        }
    }
}
