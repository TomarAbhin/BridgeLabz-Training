import java.util.*;
class Student {
    String name;
    String id;
    double[] grades;
    Student(String name, String id, int subjects) {
        this.name = name;
        this.id = id;
        this.grades = new double[subjects];
        Arrays.fill(this.grades, -1); //-1 indicates missing grade
    }
}

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGradingSystem {
    private Student[] students;
    private int numSubjects;
    private int studentCount;
    
    public StudentGradingSystem(int maxStudents, int subjects) {
        this.students = new Student[maxStudents];
        this.numSubjects = subjects;
        this.studentCount = 0;
    }
    
    public void addStudent(String name, String id) {
        if (studentCount < students.length) {
            students[studentCount++] = new Student(name, id, numSubjects);
        }
    }
    
    public void addGrade(String studentId, int subject, double grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100");
        }
        
        Student student = findStudent(studentId);
        if (student == null) {
            throw new InvalidGradeException("Student not found");
        }
        
        if (subject < 0 || subject >= numSubjects) {
            throw new InvalidGradeException("Invalid subject index");
        }
        
        student.grades[subject] = grade;
    }
    
    private Student findStudent(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].id.equals(id)) {
                return students[i];
            }
        }
        return null;
    }
    
    public double calculateTotal(String studentId) throws InvalidGradeException {
        Student student = findStudent(studentId);
        if (student == null) {
            throw new InvalidGradeException("Student not found");
        }
        
        double total = 0;
        int validGrades = 0;       
        for (double grade : student.grades) {
            if (grade != -1) {
                total += grade;
                validGrades++;
            }
        }
        if (validGrades == 0) {
            throw new InvalidGradeException("No valid grades found for student");
        }
        return total;
    }
    
    public double calculateAverage(String studentId) throws InvalidGradeException {
        Student student = findStudent(studentId);
        if (student == null) {
            throw new InvalidGradeException("Student not found");
        }        
        double total = 0;
        int validGrades = 0;
        
        for (double grade : student.grades) {
            if (grade != -1) {
                total += grade;
                validGrades++;
            }
        }
        
        if (validGrades == 0) {
            throw new InvalidGradeException("No valid grades found for student");
        }
        
        return total/validGrades;
    }
    
    public double getHighestGrade(int subject) throws InvalidGradeException {
        if (subject < 0 || subject >= numSubjects) {
            throw new InvalidGradeException("Invalid subject index");
        }
        
        double highest = -1;
        boolean hasValidGrade = false;
        
        for (int i = 0; i < studentCount; i++) {
            if (students[i].grades[subject] != -1) {
                if (!hasValidGrade || students[i].grades[subject] > highest) {
                    highest = students[i].grades[subject];
                    hasValidGrade = true;
                }
            }
        }
        if (!hasValidGrade) {
            throw new InvalidGradeException("No valid grades found for this subject");
        }
        return highest;
    }
    
    public double calculateClassAverage() throws InvalidGradeException {
        double totalSum = 0;
        int totalValidGrades = 0;
        
        for (int i = 0; i < studentCount; i++) {
            for (double grade : students[i].grades) {
                if (grade != -1) {
                    totalSum += grade;
                    totalValidGrades++;
                }
            }
        }    
        if (totalValidGrades == 0) {
            throw new InvalidGradeException("No valid grades found in class");
        }
        return totalSum/totalValidGrades;
    }
    public static void main(String[] args) {
        StudentGradingSystem system = new StudentGradingSystem(5, 3);
        Scanner s = new Scanner(System.in);
        
        try {
            //adding the students
            system.addStudent("Abhinav", "M001");
            system.addStudent("Abhay", "M002");
            system.addStudent("Palak", "M003");
    
            //add the grades
            system.addGrade("M001", 0, 85.5);
            system.addGrade("M001", 1, 93.2);
            system.addGrade("M001", 2, 77.2);
            
            system.addGrade("M002", 2, 91.0);
            system.addGrade("M002", 1, 88.5);
            
            system.addGrade("M003", 0, 76.0);
            system.addGrade("M003", 1, 88.6);
            system.addGrade("M003", 2, 95.0);
            
            System.out.println("---- Student Grade Analysis ---");
            for (int i = 0; i < system.studentCount; i++) {
                Student student = system.students[i];
                try {
                    System.out.printf("\n%s (%s):\n", student.name, student.id);
                    System.out.printf("  Total: %.2f\n", system.calculateTotal(student.id));
                    System.out.printf("  Average: %.2f\n", system.calculateAverage(student.id));
                } catch (InvalidGradeException e) {
                    System.out.printf("  Error: %s\n", e.getMessage());
                }
            }
            
            System.out.println("\n--- Subject Analysis ---");
            for (int subject = 0; subject < system.numSubjects; subject++) {
                try {
                    System.out.printf("Subject %d highest grade: %.2f\n", 
                        subject + 1, system.getHighestGrade(subject));
                } catch (InvalidGradeException e) {
                    System.out.printf("Subject %d: %s\n", subject + 1, e.getMessage());
                }
            }
            
            System.out.printf("\nClass Average: %.2f\n", system.calculateClassAverage());
            
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println();
        }
    }
}
