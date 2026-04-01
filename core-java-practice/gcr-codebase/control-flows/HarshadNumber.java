import java.util.*;
public class HarshadNumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); //input the number
        int originalNumber=num; //store original number for later use
        int sum=0; //initialize sum to 0
        while(num>0){  
            int n=num%10; //operation to get last digit
            sum+=n; //add last digit to sum
            num/=10;  //remove last digit from number
        }
        if(sum!=0 && originalNumber % sum == 0){   //check if number is divisible by sum of its digits
            System.out.println("number is a Harshad number.");
        }else{
            System.out.println("number is not a Harshad number.");
        }
    }
}
