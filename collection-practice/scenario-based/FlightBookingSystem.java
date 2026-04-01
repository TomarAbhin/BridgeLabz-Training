import java.util.*;

public class FlightBookingSystem {
    public static void main(String[] args) {
        FlightBookingSystem system = new FlightBookingSystem();
        Scanner sc = new Scanner(System.in);
        
        while (true) {  
            System.out.println("\n1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {   //switch case for choosing options
                case 1:
                    System.out.print("Enter destination: ");
                    system.searchFlights(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter flight code: ");
                    String code = sc.nextLine();
                    System.out.print("Enter passenger name: ");
                    system.bookFlight(code, sc.nextLine()); //method calling
                    break;
                case 3:
                    system.displayBookings();
                    break;
                case 4:
                    return;
            }
        }
    }

    private String[] flights = {"AI101-Delhi-Mumbai", "SG202-Mumbai-Bangalore", "UK303-Delhi-Kolkata"};
    private List<String> bookings = new ArrayList<>();
    
    //method to search flights
    public void searchFlights(String destination) {
        System.out.println("Available flights to " + destination + ":");
        for (String flight : flights) {
            if (flight.toLowerCase().contains(destination.toLowerCase())) {
                System.out.println(flight);
            }
        }
    }
    
    //method to book the flight
    public void bookFlight(String flightCode, String passenger) {
        for (String flight : flights) {
            if (flight.toLowerCase().startsWith(flightCode.toLowerCase())) {
                bookings.add(passenger + " - " + flight);
                System.out.println("Booking confirmed for " + passenger);
                return;
            }
        }
        System.out.println("Flight not found");
    }
    
    //method to display all the bookings of the flight
    public void displayBookings() {
        System.out.println("All Bookings:");
        for (String booking : bookings) {
            System.out.println(booking);
        }
    }
    
}
