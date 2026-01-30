package movies;

import java.util.*;

public class MovieRating {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("The Shawshank Redemption", 8.5, 2024),
            new Movie("My Fault", 9.0, 2023),
            new Movie("Zero", 7.8, 2022),
            new Movie("KGF", 9.2, 2024),
            new Movie("Jab We Met", 8.9, 2023),
            new Movie("War", 9.1, 2024),
            new Movie("HouseFull", 8.0, 2021)
        );

        movies.stream()
              .filter(m -> m.getRating() >= 8.0) // filter high-rated movies
              .sorted(
                  Comparator.comparing(Movie::getRating).reversed()
                            .thenComparing(Movie::getReleaseYear, Comparator.reverseOrder())
              ) // sort by rating and year
              .limit(5) // top 5 movies
              .forEach(System.out::println);
    }
}

