import java.util.*;
public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double km = s.nextDouble(); // input in kilometers
        double miles = km * 0.621371; // convert to miles
        System.out.println("the distance is : " + miles);
    }
}
