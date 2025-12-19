import java.util.*;
public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int salary=s.nextInt();   // input the salary
        int yearsOfService=s.nextInt();   // input the years of service
        if(yearsOfService>5){   // check if years of service is greater than 5
            double bonus=(5.0/100.0)*salary;   // calculate bonus as 5% of salary
            System.out.println("bonus of the employee is: "+bonus);
        }
        else{
            System.out.println("no bonus for the employee");
        }
    }
    
}
