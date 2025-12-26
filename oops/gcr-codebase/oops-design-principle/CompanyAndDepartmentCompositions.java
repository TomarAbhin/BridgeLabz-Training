import java.util.*;

class Employee {    // employee class(cannot exist without department)
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
class Department {     // department class(cannot exist without company)
    String departmentName;
    ArrayList<Employee> employees;
    Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }
    void addEmployee(String name, int id) {
        employees.add(new Employee(name, id));
    }
    void displayDepartment() {
        System.out.println("  Department: " + departmentName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}
class Company {     // company class (owns departments completely)
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
    void deleteCompany() {
        departments.clear();   // removes all departments and employees
        System.out.println("\nCompany deleted. All departments and employees removed.");
    }
}
public class CompanyAndDepartmentCompositions {
    public static void main(String[] args) {
        Company company = new Company("Juspay Pvt. Ltd.");    // creating company
        // creating departments
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee("Abhay", 103);
        d1.addEmployee("Abhinav", 107);

        d2.addEmployee("Rahul", 201);
        d2.addEmployee("Raman", 202);

        // adding departments to company
        company.addDepartment(d1);
        company.addDepartment(d2);

        // display company details
        company.displayCompanyDetails();

        // deleting company (composition behavior)
        company.deleteCompany();
    }
}
