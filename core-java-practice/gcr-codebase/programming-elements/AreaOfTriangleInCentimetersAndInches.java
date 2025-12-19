import java.util.*;
public class AreaOfTriangleInCentimetersAndInches {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double base = s.nextDouble(); // base in centimeters
        double height = s.nextDouble(); // height in centimeters
        // Calculate area in centimeters square
        double areaInCm = 0.5 * base * height;
        // Calculate area in inches square
        double areaInInches = areaInCm / (2.54*2.54);
        System.out.println("area of triangle in cm^2 is:"+ areaInCm+" and in inches^2 is: "+ areaInInches);
    }
    
}
