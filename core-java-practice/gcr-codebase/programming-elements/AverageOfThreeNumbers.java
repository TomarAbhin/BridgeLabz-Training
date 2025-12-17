import java.util.*;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); // first number
        int b = s.nextInt(); // second number 
        int c = s.nextInt(); // third number
        int sum = a + b + c; // calculate sum
        double average = sum / 3.0; // calculate average
        System.out.println("the average is : " + average);
    }
    
}
