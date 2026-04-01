import java.util.*;
public class AbundantNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); //input the number
        int sum=0; //initialize sum to 0
        for(int i=1;i<=num;i++){  
            if(num%i==0){ //check if i is a divisor of num
                sum+=i; //add divisor to sum
            }
        }
        if(sum>num){   //check if sum of divisors is greater than the number
            System.out.println("number is an Abundant number.");
        }else{
            System.out.println("number is not an Abundant number.");
        }
    }
}
