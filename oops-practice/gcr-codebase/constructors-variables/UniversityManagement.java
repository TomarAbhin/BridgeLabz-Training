public class UniversityManagement {

    static class Student {
        // access modifiers
        public int rollNumber;
        protected String name;
        private double cgpa;

        Student(int rollNumber, String name, double cgpa) { // constructor
            this.rollNumber = rollNumber;
            this.name = name;
            this.cgpa = cgpa;
        }

        public double getCGPA() { // public method to access cgpa
            return cgpa;
        }

        public void setCGPA(double cgpa) { // public method to modify cgpa
            this.cgpa = cgpa;
        }
        void display() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + cgpa);
        }
    }
    static class PostgraduateStudent extends Student {

        String specialization;
        PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
            super(rollNumber, name, cgpa);
            this.specialization = specialization;
        }
        void displayPostgraduateDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name : " + name);
            System.out.println("CGPA : " + getCGPA());
            System.out.println("Specialization: " + specialization);
        }
    }

    public static void main(String[] args) {
        // create Student object
        Student s1 = new Student(101, "Abhinav", 7.88);
        s1.display();

        // modify cgpa using public method
        s1.setCGPA(8.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        // Create PostgraduateStudent object
        PostgraduateStudent pg1 = new PostgraduateStudent(202, "Abhay", 7.8, "Computer Science");

        pg1.displayPostgraduateDetails();
    }
}


