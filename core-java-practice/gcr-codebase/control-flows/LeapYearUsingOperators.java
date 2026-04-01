import java.util.*;
public class LeapYearUsingOperators {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt(); // input the year
        if(year<1582){  //Gregorian calendar started from 1582
            System.out.println("enter a valid year according to Gregorian calendar");
        }else{
            if(year%4==0 && (year%100!=0 || year%400==0)){  //using logical operators to check leap year conditions
                System.out.println(year+" is a leap year");
            }else{
                System.out.println(year+" is not a leap year");
            }
        }
    }
}