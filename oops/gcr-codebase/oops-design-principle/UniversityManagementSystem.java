import java.util.ArrayList;

class Course {      // course class(can exist independently)
    String courseName;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();
    Course(String courseName) {
        this.courseName = courseName;
    }
    void assignProfessor(Professor professor) {
        this.professor = professor;
    }
    void addStudent(Student student) {
        students.add(student);
    }
    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {   //student class(associated with course)
    String name;
    int rollNumber;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }
    void displayStudentDetails() {
        System.out.println("Student: " + name + " (Roll No: " + rollNumber + ")");
        System.out.print("Courses: ");
        for (Course c : courses) {
            System.out.print(c.courseName + " ");
        }
        System.out.println();
    }
}
class Professor {    //professor class(associated with Course)
    String name;
    String subject;
    ArrayList<Course> courses = new ArrayList<>();
    Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }
    void displayProfessorDetails() {
        System.out.println("Professor: " + name + " | Subject: " + subject);
        System.out.print("Teaching Courses: ");
        for (Course c : courses) {
            System.out.print(c.courseName + " ");
        }
        System.out.println();
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // creating courses
        Course mpu = new Course("Microprocessors");
        Course dbms = new Course("DBMS");
        // creating professor
        Professor prof = new Professor("Pankaj Tripathi", "Computer Science");
        // assign professor to courses
        prof.assignCourse(mpu);
        prof.assignCourse(dbms);
        //creating students
        Student s1 = new Student("Abhinav", 101);
        Student s2 = new Student("Abhay", 102);

        // Enrolling students in courses
        s1.enrollCourse(mpu);
        s1.enrollCourse(dbms);

        s2.enrollCourse(mpu);

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        prof.displayProfessorDetails();

        mpu.displayCourseDetails();
        System.out.println();
        dbms.displayCourseDetails();
    }
}
