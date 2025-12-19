import java.util.*;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); // input the number
        for(int i=1;i<=num;i++){ // loop from 1 to number
            if(i%3==0 && i%5==0){ // check if the number is divisible by both 3 and 5
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){ // check if the number is divisible by 3
                System.out.println("Fizz");
            }
            else if(i%5==0){ // check if the number is divisible by 5
                System.out.println("Buzz");
            }
            else{ // if the number is not divisible by either 3 or 5
                System.out.println(i);
            }
        }
    }
}
