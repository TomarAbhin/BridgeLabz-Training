import java.util.*;
public class SortExamScoresUsingSelectionSort {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input number of students
        System.out.print("enter number of students: ");
        int n = s.nextInt();
        int[] scores = new int[n];
        //input exam scores
        System.out.println("enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = s.nextInt();
        }
        System.out.print("scores before sorting: ");
        display(scores);
        selectionSort(scores);
        System.out.print("scores after sorting: ");
        display(scores);
    }

    //method to perform Selection Sort
    static void selectionSort(int[] scores) {
        int n = scores.length;
        //loop for each position in the array
        for (int i = 0; i < n - 1; i++) {
            //assume current index has the minimum value
            int minIndex = i;
            //find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            //swap the found minimum with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
    
    static void display(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    
}


