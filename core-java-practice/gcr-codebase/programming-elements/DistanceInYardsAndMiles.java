import java.util.*;
public class DistanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        double distanceInFeet = s.nextDouble(); // take input distance in feet
        double distanceInYards = distanceInFeet/3; // converting feet to yards
        double distanceInMiles = distanceInFeet/5280; // converting feet to miles
        System.out.println("the distance in yards is: "+distanceInYards+" and in miles is: "+distanceInMiles);
        
    }
    
}
