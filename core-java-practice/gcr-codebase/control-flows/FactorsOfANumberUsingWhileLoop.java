import java.util.*;
public class FactorsOfANumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); // input the number
        System.out.println("Factors of " + num + " are:");
        int i=1;
        while(i<=num){ // loop from 1 to number
            if(num%i==0){   // check if i is a factor of num
                System.out.println(i);
            }
            i++;
        }
    }
}