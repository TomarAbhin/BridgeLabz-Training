package aerovigil;

public class AeroplaneDetails {
	private String flightNumber;
	private String  flightName;
	private int passengerCount;
	private double fuelLevel;
	public AeroplaneDetails(String flightNumber, String flightName, int passengerCount, double fuelLevel) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.passengerCount = passengerCount;
		this.fuelLevel = fuelLevel;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public double getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	

}
