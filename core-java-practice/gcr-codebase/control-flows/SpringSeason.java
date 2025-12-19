import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int month = s.nextInt() ;// input month 
        int day = s.nextInt(); // input day 
        if ((month == 3 && day >= 20)||(month == 4)||(month == 5)||(month == 6 && day <= 20)) {
            System.out.println(" the season is spring season");
        } else {
            System.out.println("the season is not spring season");
        }
    }
}