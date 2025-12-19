import java.util.*;
public class SmallestOfThreeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt(); // input the first number
        int num2 = s.nextInt(); // input the second number
        int num3 = s.nextInt(); // input the third number
        if(num1<num2 && num1<num3){
            System.out.println("yes,first number is smallest: "+num1);
        }else{
            System.out.println("no,first number is not smallest");
        }
    }
}