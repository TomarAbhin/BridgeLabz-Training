public class VehicleSystem {

    static double registrationFee = 5000.0;   // static variable common for all vehicles

    // initialize instance variables
    String ownerName;
    String vehicleType;
    final String registrationNumber; // final keyword so it cannot be changed

    // constructor
    VehicleSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // method to display vehicle details after instanceof check
    void display(Object obj) {
        if (obj instanceof VehicleSystem) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
    public static void main(String[] args) {

        // create vehicle objects
        VehicleSystem v1 = new VehicleSystem("Abhinav", "Car", "UP32KB7749");
        VehicleSystem v2 = new VehicleSystem("Abhay", "Bike", "UP85DA1674");
        v1.display(v1);
        v2.display(v2);

        VehicleSystem.updateRegistrationFee(6500.0);  // update registration fee

        System.out.println("After Updating Registration Fee:\n");
        v1.display(v1);
        v2.display(v2);
    }
}
