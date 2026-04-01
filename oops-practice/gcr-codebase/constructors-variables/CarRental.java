public class CarRental {
    
    static class CarRentalDetails {
        // initializing instance variables
        String customerName;
        String carModel;
        int rentalDays;
        double totalCost;

        CarRentalDetails() {  // Default constructor
            customerName = "Abhinav";
            carModel = " Volkswagen Virtus";
            rentalDays = 4;
            totalCost = 2000.0;
        }

        CarRentalDetails(String customerName, String carModel, int rentalDays) {  // constructor for taking user-input
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
            calculateCost();
        }

        // Method to calculate total rental cost
        void calculateCost() {
            double costPerDay = 1500.0; // fixed rental rate per day
            totalCost = rentalDays*costPerDay;
        }

        void display() { // Method to display rental details
            System.out.println("Customer Name: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Total Cost: " + totalCost);
        }
    }
    public static void main(String[] args) {
        CarRentalDetails rental1 = new CarRentalDetails();  // Using default constructor
        rental1.display();
        CarRentalDetails rental2 = new CarRentalDetails("Abhay", "Skoda Octavia", 6); // Using parameterized constructor
        rental2.display();
    }
}


