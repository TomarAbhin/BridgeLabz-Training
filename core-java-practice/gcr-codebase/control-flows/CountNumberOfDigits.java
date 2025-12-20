import java.util.*;
public class CountNumberOfDigits {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); //input the number
        int count=0; //initialize count to 0
        while(num>0){  
            num/=10;  //remove last digit from number
            count++; //increment count for each digit removed
        }   
        System.out.println("number of digits in integer is: "+count); //print the count of digits
    }
}
