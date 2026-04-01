import java.util.*;
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); // input the number
        System.out.println("Factors of " + num + " are:");
        for(int i=1;i<=num;i++){ // loop from 1 to number
            if(num%i==0){   // check if i is a factor of num
                System.out.println(i);
            }
        }
    }
}