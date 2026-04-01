package aerovigil;

import java.util.*;

public class FlightUtil {
	
	static List<String > names=Arrays.asList("SpiceJet","Vistara","IndiGo","Air Arabia");
	
	public static boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
		if(flightNumber==null || !(flightNumber.matches("FL-[1-9][0-9]{3}"))){
			throw new InvalidFlightException("The Flight Number "+flightNumber+" is invalid.");
		}
		
		return true;
	}
	
	public static boolean validateFlightName(String flightName) throws InvalidFlightException{
		if(!names.contains(flightName)) {
			throw new InvalidFlightException("The Flight Name "+flightName+" is invalid.");
		}
		
		return true;
	}
	
	public static boolean validatePassengerCount(int passengerCount,String flightName) throws InvalidFlightException{
		if(flightName.equals("SpiceJet") && passengerCount<=0 && passengerCount > 396) {
			throw new InvalidFlightException("The passenger count"+ passengerCount+" for flight "+flightName+" is invalid.");
		}
		
		if(flightName.equals("Vistara") && passengerCount<=0 && passengerCount>615) {
			throw new InvalidFlightException("The passenger count"+ passengerCount+" for flight "+flightName+" is invalid.");
		}
		
		if(flightName.equals("IndiGo") && passengerCount<=0 && passengerCount>230) {
			throw new InvalidFlightException("The passenger count"+ passengerCount+" for flight "+flightName+" is invalid.");
		}
		
		if(flightName.equals("Air Arabia") && passengerCount<=0 && passengerCount > 130) {
			throw new InvalidFlightException("The passenger count"+ passengerCount+" for flight "+flightName+" is invalid.");
		}
		
		
		return true;
	}
	
	public static double calculateFuelToFillTank(String flightName,double fuelLevel) throws InvalidFlightException{
		double fuelCapacity;
		switch (flightName) {
        case "SpiceJet":
            fuelCapacity = 200000;
            break;
        case "Vistara":
            fuelCapacity = 300000;
            break;
        case "IndiGo":
            fuelCapacity = 250000;
            break;
        case "Air Arabia":
            fuelCapacity = 150000;
            break;
        default:
            throw new InvalidFlightException("Invalid fuel level for " + flightName);
    }
		
		if(fuelLevel<=0 && fuelLevel>fuelCapacity) {
			throw new InvalidFlightException("Invalid fuel level for "+ flightName);
		}
		
		
		return fuelCapacity-fuelLevel;
	}
	

}
