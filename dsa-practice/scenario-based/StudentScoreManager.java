import java.util.*;
public class StudentScoreManager {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        //input number of students 
        while (true) {
            System.out.print("enter number of students: ");
            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Number of students must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input");
                s.next();
            }
        }
        double[] scores = new double[n];

        //read student scores 
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("enter score for student " + (i + 1) + ": ");
                if (s.hasNextDouble()) {
                    double score = s.nextDouble();
                    if (score >= 0) {
                        scores[i] = score;
                        break;
                    } else {
                        System.out.println("score cannot be negative.");
                    }
                } else {
                    System.out.println("Invalid input");
                    s.next();
                }
            }
        }

        double average = calculateAverage(scores);
        double highest = findHighest(scores);
        double lowest = findLowest(scores);

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        System.out.println("\nScores Above Average:");
        displayAboveAverage(scores, average);
    }

    //method to calculate average score
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    //method to find highest score
    public static double findHighest(double[] scores) {
        double max = scores[0];
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    //method to find lowest score
    public static double findLowest(double[] scores) {
        double min = scores[0];
        for (double score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public static void displayAboveAverage(double[] scores, double average) {
        boolean found = false;
        for (double score : scores) {
            if (score > average) {
                System.out.println(score);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No scores above average.");
        }
    }
}
