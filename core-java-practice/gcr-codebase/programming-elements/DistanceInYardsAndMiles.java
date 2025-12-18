import java.util.*;
public class DistanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        double distanceinfeet = s.nextDouble(); // take input distance in feet
        double distanceinyards = distanceinfeet / 3; // converting feet to yards
        double distanceinmiles = distanceinfeet / 5280; // converting feet to miles
        System.out.println("the distance in yards is: "+distanceinyards+" and in miles is: "+distanceinmiles);
        
    }
    
}
