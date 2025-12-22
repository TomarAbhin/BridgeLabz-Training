import java.util.*;
public class StudentsCanVoteOrNot {
    public static void main(String[] args) {
        int n = 10;                                  // total no. of students
        int[] age = generateAges(n);                  //  array of age
        String[][] ans = checkEligibility(age);    
        displayResult(ans);                                
    }

    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] age = new int[n];
        for (int i = 0; i < n; i++) {
            age[i] = r.nextInt(100) - 10;   // generates age between -10 to 89
        }
        return age;
    }
 
    public static String[][] checkEligibility(int[] age) {     // Check voting eligibility
        String[][] ans = new String[age.length][2];
        for (int i = 0; i < age.length; i++) {
            ans[i][0] = String.valueOf(age[i]);   // store age of students
            if (age[i] < 0)
                ans[i][1] = "false";
            else if (age[i] >= 18)
                ans[i][1] = "true";
            else
                ans[i][1] = "false";
        }
        return ans;
    }
    public static void displayResult(String[][] data) {   // Display ans in tabular format

        System.out.println("Age\tCan Vote");
        System.out.println("----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}


