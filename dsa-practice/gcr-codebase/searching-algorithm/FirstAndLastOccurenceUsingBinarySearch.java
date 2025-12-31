import java.util.*;
public class FirstAndLastOccurenceUsingBinarySearch {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input array size
        System.out.print("enter size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        //input sorted array elements
        System.out.println("enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        //input target element
        System.out.print("enter target element: ");
        int target = s.nextInt();

        //find first and last occurrence
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        if (first == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index: " + last);
        }
    }

    //method to find the first occurrence of target
    static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;   // stores index of first occurrence

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;      // possible first occurrence found
                right = mid - 1;     // continue searching in left half
            } else if (arr[mid] < target) {
                left = mid + 1;     // search in right half
            } else {
                right = mid - 1;     // search in left half
            }
        }
        return result;
    }

    //method to find the last occurrence of target
    static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;   // stores index of last occurrence

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;        // possible last occurrence found
                left = mid + 1;      // continue searching in right half
            } else if (arr[mid] < target) {
                left = mid + 1;      // search in right half
            } else {
                right = mid - 1;     // search in left half
            }
        }
        return result;
    }

  
}

