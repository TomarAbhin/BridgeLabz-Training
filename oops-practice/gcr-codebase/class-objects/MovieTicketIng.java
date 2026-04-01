public class MovieTicketIng {

    static class MovieTicket {
        //  initializing instance variables
        String movieName;
        int seatNumber;
        double price;

        MovieTicket(String movieName) {   // Constructor to initialize movie name
            this.movieName = movieName;
        }

        void bookTicket(int seatNumber, double price) { // method to book a ticket
            this.seatNumber = seatNumber;
            this.price = price;
        }

        void display() {   // Method to display ticket details
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: " + price);
        }
    }

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket("Shawshank Redemption");   // create MovieTicket object
        ticket.bookTicket(20, 500.0);   //  book the ticket
        ticket.display();
    }
}

