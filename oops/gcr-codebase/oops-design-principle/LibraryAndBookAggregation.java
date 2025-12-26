import java.util.*;
class Book {     // book class(independent entity)
    String title;
    String author;
    
    // constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title of Book is: " + title + ", and Author is: " + author);
    }
}

class Library {   // library class(aggregates book objects)
    String libraryName;
    ArrayList<Book> books;   // aggregation relationship

    // Constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // method to add books to library
    void addBook(Book book) {
        books.add(book);
    }
    void display() {
        System.out.println("\nLibrary Name: " + libraryName);
        System.out.println("Books Available:");
        for (Book book : books) {
            book.displayBook();
        }
    }
}
public class LibraryAndBookAggregation {

    public static void main(String[] args) {

        // creating independent book objects
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Half Girlfriend", "Chetan Bhagat");
        Book b3 = new Book("Python Basics", "Guido van Rossum");

        // creating library objects
        Library lib1 = new Library("Azad Library");
        Library lib2 = new Library("Central Library");

        // adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);   // same book in another library
        lib2.addBook(b3);
        
        lib1.display();
        lib2.display();
    }
}
