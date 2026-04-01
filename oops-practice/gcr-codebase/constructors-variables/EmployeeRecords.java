public class EmployeeRecords {

    static class Employee {
        // access modifiers
        public int employeeID;
        protected String department;
        private double salary;

        Employee(int employeeID, String department, double salary) {    // Constructor
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        public void setSalary(double salary) {  // public method to modify salary
            this.salary = salary;
        }

        public double getSalary() { // public method to access salary
            return salary;
        }
        void display() {  // display employee details
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        }
    }
    static class Manager extends Employee {
        String role;
        
        Manager(int employeeID, String department, double salary, String role) { // Constructor
            super(employeeID, department, salary);
            this.role = role;
        }
        void displayManager() {
            System.out.println("Manager ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Role: " + role);
            System.out.println("Salary: " + getSalary());
        }
    }
    public static void main(String[] args) {

        // create Employee object
        Employee emp1 = new Employee(101, "IT", 90000);
        emp1.display();

        emp1.setSalary(155000);   // modify salary using public method
        System.out.println("Updated Salary: " + emp1.getSalary());

        // create manager object
        Manager mgr1 = new Manager(201, "HR", 75000, "Team Lead");
        mgr1.displayManager();
    }
}


