import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble(); // input the radius
        double height = s.nextDouble(); // input the height
        double pi = 3.14; // pi value
        double volume = pi * radius * radius * height; // Volume calculation
        System.out.println("The volume is: " + volume);
    }
    
}
