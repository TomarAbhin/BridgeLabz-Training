public class StudentReport {

    static class Student {
        //  initializing instance variables
        String name;
        int rollNumber;
        int marks;

        Student(String name, int rollNumber, int marks) {    // Constructor to initialize student details
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        char calculateGrade() {   // Method to calculate grade based on marks
            if (marks >= 90) {
                return 'A';
            } else if (marks >= 75) {
                return 'B';
            } else if (marks >= 60) {
                return 'C';
            } else if (marks >= 40) {
                return 'D';
            } else {
                return 'F';
            }
        }

        void display() {   // Method to display student details and grade
            System.out.println("Student's Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
        }
    }

    public static void main(String[] args) {

        Student student = new Student("Abhinav", 32, 82);  // Create Student object
        student.display();
    }
}


