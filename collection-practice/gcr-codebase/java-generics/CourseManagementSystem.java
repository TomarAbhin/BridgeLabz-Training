import java.util.*;
//abstract base class 
abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    //each course defines its evaluation method
    public abstract String getEvaluationType();
}

//exam-based course
class ExamCourse extends CourseType {

    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationType() {
        return "Exam-Based Evaluation";
    }
}

//assignment-based course
class AssignmentCourse extends CourseType {

    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationType() {
        return "Assignment-Based Evaluation";
    }
}

//research-based course
class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationType() {
        return "Research-Based Evaluation";
    }
}

//generic class with bounded type parameter
class Course<T extends CourseType> {

    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    //get all courses
    public List<T> getCourses() {
        return courses;
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        //create course managers for different course types
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        examCourses.addCourse(new ExamCourse("Computer Organization"));
        examCourses.addCourse(new ExamCourse("Operating Systems"));

        assignmentCourses.addCourse(new AssignmentCourse("Web Development"));
        assignmentCourses.addCourse(new AssignmentCourse("Agile Development Methodologies"));

        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence Research"));
        researchCourses.addCourse(new ResearchCourse("Machine Learning Research"));

        displayCourses(examCourses.getCourses());
        displayCourses(assignmentCourses.getCourses());
        displayCourses(researchCourses.getCourses());
    }

    //method to handle any type of course dynamically
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Evaluation Type: " + course.getEvaluationType());
            System.out.println();
        }
    }
}


