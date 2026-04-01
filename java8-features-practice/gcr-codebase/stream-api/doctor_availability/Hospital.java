package doctor_availability;

import java.util.*;

public class Hospital {

    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor("Dr. Abha", "Cardiology", true),
            new Doctor("Dr. Bhavesh", "Neurology", false),
            new Doctor("Dr. Ramesh", "Orthopedics", true),
            new Doctor("Dr. Ajit", "Dermatology", true),
            new Doctor("Dr. Neha", "Cardiology", false)
        );

        doctors.stream()
               .filter(Doctor::isAvailableOnWeekend) // weekend availability
               .sorted(Comparator.comparing(Doctor::getSpecialty)) // sort by specialty
               .forEach(System.out::println);
    }
}

