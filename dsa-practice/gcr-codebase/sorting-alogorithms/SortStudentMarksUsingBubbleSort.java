import java.util.*;
public class SortStudentMarksUsingBubbleSort {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of students: ");  //input the number of students
        int n = s.nextInt();
        int[] marks = new int[n];
        //taking student marks
        System.out.println("enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = s.nextInt();
        }
        System.out.print("marks before sorting: ");
        display(marks);
        //sorting marks using Bubble Sort
        bubbleSort(marks);

        System.out.print("marks after sorting: ");
        display(marks);
    }
    //method to perform Bubble Sort
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        //outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            //inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                //if current element is greater than next, swap them
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            //if no swapping happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    //method to display marks
    static void display(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

   
}
