package memberships;

import java.time.LocalDate;
import java.util.*;

public class Gym {

    public static void main(String[] args) {

        List<GymMember> members = List.of(
            new GymMember("Amit", LocalDate.now().plusDays(10)),
            new GymMember("Riya", LocalDate.now().plusDays(40)),
            new GymMember("Karan", LocalDate.now().plusDays(25)),
            new GymMember("Sneha", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
               .filter(m -> !m.getExpiryDate().isBefore(today)
                         && !m.getExpiryDate().isAfter(next30Days)) // expires within 30 days
               .forEach(System.out::println);
    }
}
