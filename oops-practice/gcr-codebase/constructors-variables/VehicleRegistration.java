public class VehicleRegistration {

    static class Vehicle {
        //initializing instance variables
        String ownerName;
        String vehicleType;
        static double registrationFee = 5000.0;

        // Constructor
        Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }
        void display() { // method to display vehicle details
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }

        // Class method to update registration fee
        static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }
    }

    public static void main(String[] args) {

        // Create Vehicle objects
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.display();
    
        v2.display();

        // Update registration fee
        Vehicle.updateRegistrationFee(7500.0);

        System.out.println("After Updating Registration Fee:\n");

        v1.display();

        v2.display();
    }
}


