import java.util.*;
public class SortProductPricesUsingQuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input number of products
        System.out.print("enter number of products: ");
        int n = s.nextInt();
        double[] prices = new double[n];
        //input product prices
        System.out.println("enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = s.nextDouble();
        }
        System.out.print("prices before sorting: ");
        display(prices);
        quickSort(prices, 0, n - 1);
        System.out.print("prices after sorting: ");
        display(prices);
    }
    //method to perform Quick Sort
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            //partition the array and get pivot index
            int pivotIdx = partition(prices, low, high);
            //recursively sort left and right subarrays
            quickSort(prices, low, pivotIdx - 1);
            quickSort(prices, pivotIdx + 1, high);
        }
    }

    //method to place pivot at correct position
    public static int partition(double[] prices, int low, int high) {
        //choosing last element as pivot
        double pivot = prices[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            //place smaller elements on the left of pivot
            if (prices[j] <= pivot) {
                i++;
                //swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        //place pivot at correct position
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1; 
    }
    static void display(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

   
    
}


