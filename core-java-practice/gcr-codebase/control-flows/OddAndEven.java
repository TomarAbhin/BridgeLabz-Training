import java.util.*;
public class OddAndEven {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); //input the number
        for(int i=1;i<=num;i++){ //loop from 1 to number
            if(i%2==0){ //check if the number is even
                System.out.println(i+" is even number");
            }
            else{ //if the number is not even then it is odd
                System.out.println(i+" is odd number");
            }
        }
    }
    
}
