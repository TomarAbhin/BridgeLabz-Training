public class BonusOfEmployeesUsingMethod {
    public static void main(String[] args) {
        int employees = 10;      //number of employees
        int[][] employeeData = generateEmployeeData(employees );   // 2D array to store salary and years of service
        double totalBonus = 0.0;
        System.out.println("Employee Details:\n");

        for (int i = 0; i < employees ; i++) {

            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            // Calculate bonus based on years of service
            double bonus = calculateBonus(salary, yearsOfService);
            double newSalary = salary + bonus;

            totalBonus += bonus;

            // Display employee details
            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary: " + salary);
            System.out.println("Years of Service: " + yearsOfService);
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary);
            System.out.println();
        }

        // Display total bonus paid by company
        System.out.println("Total Bonus to be paid by company is: " + totalBonus);
    }
    public static int[][] generateEmployeeData(int size) {     // Method to generate salary and years of service for employees
        int[][] data = new int[size][2];

        for (int i = 0; i < size; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;   // Generate 5-digit salary (10000 to 99999)

            data[i][1] = (int) (Math.random() * 10) + 1;   // Generate years of service (1 to 10 years)
        }

        return data;
    }

    public static double calculateBonus(int salary, int yearsOfService) {    // Method to calculate bonus based on years of service

        if (yearsOfService > 5) {    // 5% bonus if service > 5 years, else 2%
            return salary * 0.05;
        } else {
            return salary * 0.02;
        }
    }
}

