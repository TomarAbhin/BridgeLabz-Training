public class Book {
    static class BookDetails {
        // Instance variables
        String title;
        String author;
        double price;

        BookDetails() {   // Default constructor
            title = "Rich Dad Poor Dad";
            author = "Robert Kiyosaki";
            price = 560.0;
        }
        BookDetails(String title, String author, double price) {  // constructor for taking user-input
            this.title = title;
            this.author = author;
            this.price = price;
        }
        void display() {   // method to display book details
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        BookDetails book1 = new BookDetails();    // Using default constructor
        book1.display();

       // System.out.println();
        BookDetails book2 = new BookDetails("The Black Swan", "Nassim Nicholas Taleb", 550.0);   // Using parameterized constructor
        book2.display();
    }
}


