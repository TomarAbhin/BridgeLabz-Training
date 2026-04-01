import java.util.*;
public class PCMUsingMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int studens = s.nextInt();

        // Generate random PCM scores
        int[][] scores = generateRandomScores(studens);

        // Calculate total, average, percentage
        double[][] ans = calculateResults(scores);

        // Display scorecard
        displayScorecard(scores, ans);
    }

    
    public static int[][] generateRandomScores(int studens) {  // Method to generate random 2-digit PCM scores for students

        int[][] scores = new int[studens][3]; // 3 subjects: Physics, Chemistry, Maths

        for (int i = 0; i < studens; i++) {
            for (int j = 0; j < 3; j++) {
                // Random 2-digit marks (10-99)
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }

        return scores;
    }

   
    public static double[][] calculateResults(int[][] scores) {   // Method to calculate total, average, percentage

        int studens = scores.length;
        double[][] ans = new double[studens][3]; // total, average, percentage

        for (int i = 0; i < studens; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = ((double) total / 300) * 100;

            // Round off to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            ans[i][0] = total;
            ans[i][1] = average;
            ans[i][2] = percentage;
        }

        return ans;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] ans) {

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print((int) ans[i][0] + "\t");
            System.out.print(ans[i][1] + "\t");
            System.out.println(ans[i][2]);
        }
    }
}

