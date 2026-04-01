import java.util.*;

public class SubArraysWithZeroSum {

    static void findZeroSumSubarrays(int[] arr) {
        // Map to store cumulative sum and its indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Sum 0 at index -1 helps handle subarrays starting from index 0
        map.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                // If sum repeats, zero-sum subarray exists
                for (int start : map.get(sum)) {
                    System.out.println("Subarray from index " + (start + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();     // array elements
        }

        findZeroSumSubarrays(arr);

    }
}
