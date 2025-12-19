import java.util.*;
public class SumOfNumbersUntilZero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double total =0;
        while (true) {
            double num=s.nextDouble(); // input the starting num for countdown
            if (num == 0) {
                break;
            }
            total+=num;
        }
        System.out.println("the total is: " + total);
    }
    
}
