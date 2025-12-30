interface GPS {    //gps interface
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle implements GPS {   //abstract vehicle class
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;
    Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = "Unknown";
    }
    //encapsulated getters

    public int getVehicleId() {    
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    
    void getVehicleDetails() {   //Concrete method
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Location: " + location);
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    //abstract method
    abstract double calculateFare(double distance);
}

class Car extends Vehicle {   //car subclass
    Car(int vehicleId, String driverName) {
        super(vehicleId, driverName, 15.0);
    }
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Bike extends Vehicle {  //bike subclass
    Bike(int vehicleId, String driverName) {
        super(vehicleId, driverName, 8.0);
    }
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Auto extends Vehicle {   //auto subclass
    Auto(int vehicleId, String driverName) {
        super(vehicleId, driverName, 12.0);
    }
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

public class RideHailingSystem {

    //polymorphic method
    static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs" + vehicle.calculateFare(distance));
        System.out.println();
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car(101, "Abhinav");
        Vehicle v2 = new Bike(102, "Abhay");
        Vehicle v3 = new Auto(103, "Neha");
        v1.updateLocation("Aishbagh");
        v2.updateLocation("Alambagh");
        v3.updateLocation("Saheed Path");

        calculateRideFare(v1, 10);
        calculateRideFare(v2, 10);
        calculateRideFare(v3, 10);
    }
}
