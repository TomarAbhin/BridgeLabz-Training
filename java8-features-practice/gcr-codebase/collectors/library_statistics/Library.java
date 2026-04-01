package library_statistics;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Java Basics", "Education", 350),
            new Book("DSA Guide", "Education", 500),
            new Book("Mystery House", "Fiction", 280),
            new Book("Space Wars", "Fiction", 420),
            new Book("History of India", "History", 600)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
            books.stream()
                 .collect(Collectors.groupingBy(
                     Book::getGenre,
                     Collectors.summarizingInt(Book::getPages)
                 ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Maximum Pages: " + stats.getMax());
            System.out.println();
        });
    }
}

