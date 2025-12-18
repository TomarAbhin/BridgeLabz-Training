import java.util.*;
public class IntOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); //input first number
        int b = s.nextInt(); // input second number
        int c=s.nextInt(); // input third number
        int r1 = a+b*c; // first operation
        int r2 = a*b+c; // second operation
        int r3 = c+a/b; // third operation
        int r4 = a%b+c; // fourth operation

        System.out.println("the result of operation of three numbers " +a+", "+b+" and "+c+" is: "+r1+", "+r2+", "+r3+" and "+r4);
    }
    
}
