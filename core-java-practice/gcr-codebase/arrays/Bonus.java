import java.util.*;
public class Bonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 10;  //number of employees
        // Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];
        double totalbonus = 0;
        double totalOld = 0;
        double totalNew = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("enter the salary of employee " + (i + 1));
            salary[i] = s.nextDouble();
            System.out.println("enter years of service of employee " + (i + 1));
            years[i] = s.nextDouble();
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input,please enter again");
                i--;
            }
        }
        for (int i = 0; i < n; i++) {
            // Calculate bonus based on years of service
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalbonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
            //Accumulate totals
        }
        System.out.println("Total Bonus Payout = " + totalbonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }
}
  

