import java.util.*;
public class LinearAndBinarySearchChallenge {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input array size
        System.out.print("enter number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        //input array elements
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        //linear search part 
        int missing = firstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        //binary search part
        // Sort array before binary search
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        //input target for binary search
        System.out.print("enter target element to search: ");
        int target = s.nextInt();

        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + index);
        }
    }

    //method to find the first missing positive integer using Linear Search
    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        //boolean array to mark visited positive numbers
        boolean[] visited = new boolean[n + 1];

        //mark numbers that are in range 1 to n
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        //find the first number that is not visited
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;   // first missing positive number
            }
        }

        //if all numbers from 1 to n are present
        return n + 1;
    }

    //method to perform Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;           // target found
            } else if (arr[mid] < target) {
                left = mid + 1;       // search right half
            } else {
                right = mid - 1;      // search left half
            }
        }

        return -1; 
    }

   
}
