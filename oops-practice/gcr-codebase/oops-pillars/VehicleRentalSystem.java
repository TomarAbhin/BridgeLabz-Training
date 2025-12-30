import java.util.*;

interface Insurable {    //interface for insurance-related behavior
    double calculateInsurance(int days);
    String getInsuranceDetails();
}

//abstract vehicle class
abstract class Vehicle {
    private String vehicleNumber;     // encapsulated
    private String type;
    protected double rentalRate;       // accessible to subclasses

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //getter methods only
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    //concrete method
    void getVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rate per day: Rs" + rentalRate);
    }

    //abstract method
    abstract double calculateRentalCost(int days);
}

//car subclass
class Car extends Vehicle implements Insurable {
    private final String insurancePolicyNumber = "CAR-ANS-0101";
    Car(String vehicleNumber) {
        super(vehicleNumber, "Car", 1800);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance(int days) {
        return 200 * days;
    }

    public String getInsuranceDetails() {
        return "Car Insurance | Policy No: " + insurancePolicyNumber;
    }
}

//bike subclass
class Bike extends Vehicle implements Insurable {
    private final String insurancePolicyNumber = "BIKE-ANS-0201";
    Bike(String vehicleNumber) {
        super(vehicleNumber, "Bike", 900);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance(int days) {
        return 80 * days;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance | Policy No: " + insurancePolicyNumber;
    }
}

//truck subclass
class Truck extends Vehicle implements Insurable {
    private final String insurancePolicyNumber = "TRUCK-ANS-0301";

    Truck(String vehicleNumber) {
        super(vehicleNumber, "Truck", 5000);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days + 1000; // extra heavy-load charge
    }

    public double calculateInsurance(int days) {
        return 400 * days;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance | Policy No: " + insurancePolicyNumber;
    }
}

public class VehicleRentalSystem {

    //polymorphic processing
    static void processRental(Vehicle vehicle, int days) {
        vehicle.getVehicleDetails();

        double rentalCost = vehicle.calculateRentalCost(days);
        System.out.println("Rental Cost for " + days + " days: Rs" + rentalCost);

        if (vehicle instanceof Insurable) {
            Insurable ins = (Insurable) vehicle;
            double insurance = ins.calculateInsurance(days);
            System.out.println(ins.getInsuranceDetails());
            System.out.println("Insurance Cost: Rs" + insurance);
            System.out.println("Total Amount: Rs" + (rentalCost + insurance));
        }

        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("UP32-CA-1234"));
        vehicles.add(new Bike("UP32-BI-5678"));
        vehicles.add(new Truck("UP32-TR-9012"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            processRental(v, rentalDays);
        }
    }
}
