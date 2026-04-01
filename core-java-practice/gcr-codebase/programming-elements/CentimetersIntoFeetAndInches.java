import java.util.*;
public class CentimetersIntoFeetAndInches {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // input height in centimeters
        double totalInches = height/2.54; // convert height to inches
        double feet = totalInches/12; // calculate feet
        System.out.println("height in cm is: "+height+" while in feet is: "+feet+" and in inches is: "+totalInches);
    }
    
}
