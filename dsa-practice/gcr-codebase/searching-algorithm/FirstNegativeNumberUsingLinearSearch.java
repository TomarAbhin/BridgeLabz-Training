import java.util.*;
public class FirstNegativeNumberUsingLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input the size of array
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input the elements in array
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //call linear search method
        int index = findFirstNegative(arr);
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array");
        }
    }

    //method to find index of first negative number using Linear Search
    static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //check if current element is negative
            if (arr[i] < 0) {
                return i; // return index if negative number found
            }
        }

        //if no negative number is found
        return -1;
    }

    
}

