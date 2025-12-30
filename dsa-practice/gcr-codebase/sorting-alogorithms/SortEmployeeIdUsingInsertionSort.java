import java.util.*;
public class SortEmployeeIdUsingInsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of employees: "); //input the number of employees
        int n = s.nextInt();
        int[] employeeIds = new int[n];

        //input employee IDs
        System.out.println("enter employee IDs:");
        for (int i = 0; i < n; i++) {
            employeeIds[i] = s.nextInt();
        }
        System.out.print("employee IDs before sorting: ");
        display(employeeIds);
        //sorting using insertion sort
        insertionSort(employeeIds);
        System.out.print("employee IDs after sorting: ");
        display(employeeIds);
    }
    //method to perform insertion sort
    static void insertionSort(int[] ids) {
        //start from second element as first is already considered sorted
        for (int i = 1; i < ids.length; i++) {
            int current = ids[i];   // element to be placed
            int j = i - 1;
            //shift elements greater than current to the right
            while (j >= 0 && ids[j] > current) {
                ids[j + 1] = ids[j];
                j--;
            }
            //place current element at its correct position
            ids[j + 1] = current;
        }
    }
    static void display(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    
}

