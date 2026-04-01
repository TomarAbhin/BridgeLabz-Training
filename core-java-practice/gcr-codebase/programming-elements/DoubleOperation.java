import java.util.*;
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(); //input first number
        double b = s.nextDouble(); // input second number
        double c = s.nextDouble(); // input third number
        double r1 = a+b*c; // first operation
        double r2 = a*b+c; // second operation
        double r3 = c+a/b; // third operation
        double r4 = a%b+c; // fourth operation
        System.out.println("the result of operation of three numbers " + a + ", " + b + " and " + c + " is: " + r1 + ", " + r2 + ", " + r3 + " and " + r4);
    }
    
}
