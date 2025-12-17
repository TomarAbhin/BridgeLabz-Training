import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double rad = s.nextDouble(); // input the  radius
        double pi=3.14; // pi value
        double area = pi * rad * rad; // Area calculation
        System.out.println("The area is: " + area);
    }
    
}
