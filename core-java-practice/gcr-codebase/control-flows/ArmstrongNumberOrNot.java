import java.util.*;
public class ArmstrongNumberOrNot {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); //input number to check armstrong or not
        int original=num;  
        int sum=0; //initialize sum to 0
        while(original>0){  
            int n=original%10; //operation to get last digit
            sum+=n*n*n; //cube of last digit and add to sum
            original/=10;  //remove last digit from original number
        }
        if(sum==num){   //check if sum is equal to the number
            System.out.println("the number "+num+" is armstrong number.");
        }else{
            System.out.println("the number "+num+" is not armstrong number.");
        }
    }
}