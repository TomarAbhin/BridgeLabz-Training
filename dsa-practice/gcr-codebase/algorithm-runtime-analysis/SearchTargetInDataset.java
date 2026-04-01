import java.util.*;
public class SearchTargetInDataset {
    public static void main(String[] args) {
        //different dataset sizes
        int[] datasetSizes = {1000, 10000, 1_000_000};
        for (int size : datasetSizes) {
            //create dataset
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = i + 1;
            }
            int target = size; 

            //linear search (O(N))
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();
            //binary search (O(log N))
            //data must be sorted before binary search
            Arrays.sort(data);

            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();

            //convert time to milliseconds
            double linearTime = (endLinear - startLinear)/1_000_000.0;
            double binaryTime = (endBinary - startBinary)/1_000_000.0;

            System.out.println("Dataset Size (N): " + size);
            System.out.println("Linear Search Time (O(N)): " + linearTime + " ms");
            System.out.println("Binary Search Time (O(log N)): " + binaryTime + " ms");
        }
    }

    //method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }

    //method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}


