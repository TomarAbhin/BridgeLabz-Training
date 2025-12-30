import java.util.*;
class Course {    //course class(associated with Student)
    String courseName;
    ArrayList<Student> enrolledStudents = new ArrayList<>();
    Course(String courseName) {
        this.courseName = courseName;
    }
    void addStudent(Student student) {
        enrolledStudents.add(student);
    }
    void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("  " + s.name);
        }
    }
}
class Student {    //student class(associated with Course)
    String name;
    int rollNo;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // bidirectional association
    }
    void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("  " + c.courseName);
        }
    }
}

class School {     //school class(aggregates Students)
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();
    School(String schoolName) {
        this.schoolName = schoolName;
    }
    void addStudent(Student student) {
        students.add(student);
    }
    void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("  " + s.name);
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Lucknow Public Colligiate");  //creating school
        //creating students
        Student s1 = new Student("Abhay", 1);
        Student s2 = new Student("Abhinav", 2);
        //creating courses
        Course c1 = new Course("Hindi");
        Course c2 = new Course("Computer Science");
        //aggregation: school has students
        school.addStudent(s1);
        school.addStudent(s2);
        //association: students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        school.showStudents();
        
        s1.showCourses();
        
        c2.showEnrolledStudents();
    }
}

