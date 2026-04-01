import java.util.*;
public class CheckAndSumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(); // input a number
        int sum = 0; // initialize sum variable
        if(num>0){  // check if the number is natural
            for(int i=1;i<=num;i++){
                sum += i; // summing natural numbers
            }
            System.out.println("the sum of natural number: "+num+" is: "+sum);
        }else{
            System.out.println("number is not a natural number.");
        }
    }
    
}
