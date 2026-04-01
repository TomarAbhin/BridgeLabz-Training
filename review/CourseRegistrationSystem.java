import java.util.*;
class CourseLimitException extends Exception {
    public CourseLimitException(String message) {
        super(message);
    }
}
class Person {
    protected String name;
    protected int id;
    
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Student extends Person {
    private LinkedList<String> courses;
    private HashMap<String, String> grades;

    public Student(String name, int id) {
        super(name, id);
        this.courses = new LinkedList<>();
        this.grades = new HashMap<>();
    }
    
    public String getName() {
        return name;
    }
    public int getId() { 
        return id; 
    }
    public LinkedList<String> getCourses() { 
        return courses; 
    }
    
    public void addCourse(String course) throws CourseLimitException {
        if (courses.size() >= 5) {
            throw new CourseLimitException("Cannot enroll in 5 courses");
        }
        courses.add(course);
    }
    
    public void dropCourse(String course) {
        courses.remove(course);
        grades.remove(course);
    }
    
    public void setGrade(String course, String grade) {
        if (courses.contains(course)) {
            grades.put(course, grade);
        }
    }
    
    public String getGrade(String course) {
        return grades.get(course);
    }
}

abstract class RegistrationService {
    public abstract void enrollStudent(int Id, String course) throws CourseLimitException;
    public abstract void dropStudent(int Id, String course);
    public abstract void assignGrade(int Id, String course, String grade);
}

class StudentRegistration extends RegistrationService {
    private HashMap<Integer, Student> students;
    public StudentRegistration() {
        this.students = new HashMap<>();
    }

    public void registerStudent(Student student) {
        students.put(student.getId(), student);
        System.out.println("Student " + student.getName() + " has been registered successfully");
    }
    
    @Override
    public void enrollStudent(int Id, String course) throws CourseLimitException {
        Student student = students.get(Id);
        if (student != null) {
            student.addCourse(course);
            System.out.println(student.getName() + " enrolled in " + course);
        }
    }
    
    @Override
    public void dropStudent(int Id, String course) {
        Student student = students.get(Id);
        if (student != null) {
            student.dropCourse(course);
            System.out.println(student.getName() + " has dropped from " + course);
        }
    }

    @Override
    public void assignGrade(int Id, String course, String grade) {
        Student student = students.get(Id);
        if (student != null) {
            student.setGrade(course, grade);
            System.out.println("Grade " + grade + " has been assigned to " + student.getName() + " in the course " + course);
        }
    }
    
    public void viewGrades(int Id) {
        Student student = students.get(Id);
        if (student != null) {
            System.out.println("Grades for " + student.getName() + ":");
            for (String course : student.getCourses()) {
                String grade = student.getGrade(course);
                System.out.println(course + ": " + (grade != null ? grade : "No grade has been provided to the student "));
            }
        }
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        StudentRegistration registration = new StudentRegistration();
        Student s1 = new Student("Abhinav Tomar", 101);
        Student s2 = new Student("Pankaj pandey", 102);
        registration.registerStudent(s1);
        registration.registerStudent(s2);
        
        try{
            registration.enrollStudent(101, "TOC");
            registration.enrollStudent(101, "Operating Systems");
            registration.enrollStudent(102,"Cryptography And Security Networks");
        
            registration.assignGrade(101, "TOC", "B");
            registration.assignGrade(102, "Cryptography And Security Networks", "A+");

            registration.viewGrades(101);
            registration.viewGrades(102);
            
            registration.dropStudent(101, "TOC");
            registration.viewGrades(101);
        }catch(Exception e){
            System.out.println("Exception has been detected: ");
        }
    }
}




