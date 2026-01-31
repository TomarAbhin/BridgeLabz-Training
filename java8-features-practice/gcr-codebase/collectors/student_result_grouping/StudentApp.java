import java.util.*;
import java.util.stream.Collectors;

public class StudentApp {

    public static void main(String[] args) {

        List<Student> students = List.of(
            new Student("Abhinav", "A"),
            new Student("Riya", "B"),
            new Student("Karan", "A"),
            new Student("Sneha", "C"),
            new Student("Amit", "B")
        );

        Map<String, List<String>> studentsByGrade =
            students.stream()
                    .collect(
                        Collectors.groupingBy(
                            Student::getGrade,
                            Collectors.mapping(Student::getName, Collectors.toList())
                        )
                    );

        studentsByGrade.forEach((grade, names) ->
            System.out.println(grade + " : " + names)
        );
    }
}
