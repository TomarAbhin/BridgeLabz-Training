package names;

import java.util.*;

public class Customer {

    public static void main(String[] args) {

        List<String> names = List.of("Jyotika","Abhay","Karan","Nystha","Abhinav");

        names.stream()
             .map(String::toUpperCase) // convert to uppercase
             .sorted() // alphabetical order
             .forEach(System.out::println);
    }
}

