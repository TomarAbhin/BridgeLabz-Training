class Movie {  //node class for Doubly Linked List
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    //constructor
    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

//doubly linked list class
class MovieList {
    private Movie head;
    private Movie tail;
    //add movie at beginning
    void addAtBeginning(String title, String director, int year, double rating) {
        Movie node = new Movie(title, director, year, rating);

        if (head == null) {
            head = tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    //add movie at end
    void addAtEnd(String title, String director, int year, double rating) {
        Movie node = new Movie(title, director, year, rating);

        if (tail == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    //add movie at specific position
    void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        Movie node = new Movie(title, director, year, rating);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    //remove movie by title
    void removeByTitle(String title) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    //search movie by director
    void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
    }

    //search movie by minimum rating
    void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with rating >= " + rating);
        }
    }

    //update rating using movie title
    void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }

    private void printMovie(Movie m) {
        System.out.println(m.title + " | " +m.director + " | " +m.year + " | Rating: " +m.rating);
    }
}


public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList list = new MovieList();

        list.addAtBeginning("Oppenheimer", "Nolan", 2023, 8.8);
        list.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        list.addAtEnd("Avatar-2", "Cameron", 2021, 7.8);
        list.addAtPosition(2, "Titanic", "Cameron", 1997, 7.9);

        System.out.println("Movies (Forward):");
        list.displayForward();

        System.out.println("\nMovies (Reverse):");
        list.displayReverse();

        System.out.println("\nSearch by Director: Nolan");
        list.searchByDirector("Nolan");

        System.out.println("\nUpdate Rating of Avatar:");
        list.updateRating("Avatar-2", 8.2);
        list.displayForward();

        System.out.println("\nRemove Titanic:");
        list.removeByTitle("Titanic");
        list.displayForward();
    }
}
