import java.util.*;
public class SortBookPricesUsingMergeSort {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input number of books
        System.out.print("enter number of books: ");
        int n = s.nextInt();
        double[] prices = new double[n];
        //input book prices
        System.out.println("enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = s.nextDouble();
        }
        System.out.print("book prices before sorting: ");
        display(prices);
        mergeSort(prices, 0, n - 1);
        System.out.print("book prices after sorting: ");
        display(prices);
    }

    //method to perform merge sort
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            //sort left half
            mergeSort(prices, left, mid);
            //sort right half
            mergeSort(prices, mid + 1, right);
            //merge both halves
            merge(prices, left, mid, right);
        }
    }

    //method to merge two sorted halves
    public static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        double[] leftArr = new double[n1];
        double[] rightArr = new double[n2];
        //copy data into temporary arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = prices[mid + 1 + j];
        int i = 0;
        int j = 0;
        int k = left;
        //merge by comparing elements
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k++] = leftArr[i++];
            } else {
                prices[k++] = rightArr[j++];
            }
        }
        //copy remaining elements
        while (i < n1) {
            prices[k++] = leftArr[i++];
        }
        while (j < n2) {
            prices[k++] = rightArr[j++];
        }
    }

    public static void display(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

   
}


