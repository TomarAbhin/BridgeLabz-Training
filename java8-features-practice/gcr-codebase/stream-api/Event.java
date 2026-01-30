package event;

import java.util.*;

public class Event {

    public static void main(String[] args) {

        List<String> attendees = List.of("Abhinav","Riya","Karan","Sneha");

        attendees.stream()
                 .forEach(name ->
                     System.out.println("Welcome to the event, " + name + "!")
                 ); // welcome message
    }
}

