import java.util.*;
public class TriangularPark {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first side of triangle: ");
        double side1 = s.nextDouble();   // take input for first side in meters
        System.out.print("Enter second side of triangle: ");
        double side2 = s.nextDouble();  // take input for second side
        System.out.print("Enter third side of triangle: ");
        double side3 = s.nextDouble();  // take input for third side

        double ans = calculateRounds(side1, side2, side3);  // calling the method to calculate 

        System.out.println("The athlete completes " + ans + " rounds to finish a 5 km run.");

    }
    public static double calculateRounds(double a, double b, double c) {  // Method to calculate number of rounds required to complete 5 km
   
        double perimeter = a + b + c;     // Perimeter of triangle in meters
        double totalDistance = 5000;      // 5 km = 5000 meters

        return totalDistance / perimeter; // calculation of number of rounds
    }
}


