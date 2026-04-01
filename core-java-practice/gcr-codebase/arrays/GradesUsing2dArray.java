import java.util.*;
public class GradesUsing2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grades = new char[n]; 
        for (int i = 0; i < n; i++) {     // input the marks
            System.out.println("\nStudent " + (i + 1));
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {     // Calculate percent and grades
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;

            if (percent[i] >= 80)
                grades[i] = 'A';
            else if (percent[i] >= 70)
                grades[i] = 'B';
            else if (percent[i] >= 60)
                grades[i] = 'C';
            else if (percent[i] >= 50)
                grades[i] = 'D';
            else if (percent[i] >= 40)
                grades[i] = 'E';
            else
                grades[i] = 'R';
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percent[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}


