package aerovigil;

import java.util.*;

public class FlightInterface {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	     System.out.print("Enter flight details in format: ");

	     String input = sc.nextLine();

	      try {
            String[] parts = input.split(":");
            if (parts.length != 4) {
	        throw new InvalidFlightException("Invalid input format");
            }

	         String flightNumber = parts[0];
	         String flightName = parts[1];
	            int passengerCount = Integer.parseInt(parts[2]);
	            double currentFuel = Double.parseDouble(parts[3]);

	            // Validations
	            FlightUtil.validateFlightNumber(flightNumber);
	            FlightUtil.validateFlightName(flightName);
	            FlightUtil.validatePassengerCount(passengerCount,flightName);

	            // Fuel calculation
	            double fuelToFill = FlightUtil.calculateFuelToFillTank(flightName, currentFuel);

	            System.out.println("Fuel required to fill the tank: " + fuelToFill + " liters");

	        } catch (InvalidFlightException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Passenger count and fuel level must be numeric");
	        } finally {
	            sc.close();
	        }
	 }
}



