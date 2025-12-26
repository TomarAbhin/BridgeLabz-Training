public class LibrarySystem {

    static String libraryName = "Kalam Library";  // static variable shared across all books

    // initialize instance variables
    String title;
    String author;
    final String isbn; // final keyword so ISBN cannot be changed

    // constructor 
    LibrarySystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // method to display book details using instanceof check
    void display(Object obj) {
        if (obj instanceof LibrarySystem) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
    public static void main(String[] args) {
        LibrarySystem.displayLibraryName();

        // create book objects
        LibrarySystem book1 = new LibrarySystem("Java Programming", "James Gosling", "ISBN101");
        LibrarySystem book2 = new LibrarySystem("Half Girlfriend", "Chetan Bhagat", "ISBN102");

        book1.display(book1);
        book2.display(book2);
    }
}
