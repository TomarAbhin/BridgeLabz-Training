import java.util.*;
public class GreatestFactorOfANumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); // input the number
        System.out.println("greatest factor of " + num + " is:");
        int i=num-1;
        while(i>=1){ // loop from number-1 to 1
            if(num%i==0){   // check if i is a factor of num
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}