import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt(); // input the year
        if(year<1582){
            System.out.println("Enter a valid year according to Gregorian calendar");
        }else{
            if(year%4==0){  //checking divisibility by 4
                if(year%100==0){  
                    if(year%400==0){ //checking divisibility by 400
                        System.out.println(year+" is a leap year");
                    }else{
                        System.out.println(year+" is not a leap year");
                    }
                }else{
                    System.out.println(year+" is a leap year");
                }
            }
            else{
                System.out.println(year+" is not a leap year");
            }
        }
    }
    
}
