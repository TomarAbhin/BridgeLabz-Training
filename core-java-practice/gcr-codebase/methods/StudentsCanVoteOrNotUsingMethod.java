import java.util.*;
public class StudentsCanVoteOrNotUsingMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store the ages of 10 students

        // Loop to take input and check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = s.nextInt();

            boolean result = canStudentVote(ages[i]);   // Calling method to check voting eligibility

            if (result) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }

    public static boolean canStudentVote(int age) {  // Method to check whether a student can vote
        if (age < 0) {    //checking the age if it is correctly entered or not
            return false;
        }

        if (age >= 18) {     // Check voting eligibility
            return true;
        }

        return false;
    }
}


