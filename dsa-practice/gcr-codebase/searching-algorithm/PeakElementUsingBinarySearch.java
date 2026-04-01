import java.util.*;
public class PeakElementUsingBinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input the array size
        System.out.print("enter size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        //input the array elements
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        //call the method
        int peakIndex = peakElement(arr);
        if (peakIndex != -1) {
            System.out.println("Peak element found at index: " + peakIndex);
            System.out.println("Peak element value: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found");
        }
    }

    //method to find a peak element using Binary Search
    static int peakElement(int[] arr) {
        int left = 0;              //left pointer starts from index 0
        int right = arr.length - 1;    //right pointer starts from last index

        //binary search loop
        while (left <= right) {
            //calculate mid index
            int mid = left + (right - left) / 2;
            //check left elements
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            //check right elements
            boolean rightOK = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);
            //if current element is greater than both elements, it is a peak
            if (leftOK && rightOK) {
                return mid; // return index of peak element
            }

            //if left element is greater, move search to left half
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            //else move search to right half
            else {
                left = mid + 1;
            }
        }

        return -1; 
    }

    
}


