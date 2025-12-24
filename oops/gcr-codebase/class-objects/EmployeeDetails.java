public class EmployeeDetails {

    static class Employee {
        // declaration of instance variables
        String name;
        int id;
        double salary;

        // Constructor to initialize employee details
        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        // Method to display employee details
        void display() {
            System.out.println("Employee Name is: " + name);
            System.out.println("Employee ID is: " + id);
            System.out.println("Employee Salary is: " + salary);
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Abhinav", 104, 45000.0);   // Create Employee object

        emp1.display();   // Display employee details
    }
}
    
