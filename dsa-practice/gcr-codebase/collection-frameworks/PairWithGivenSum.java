import java.util.*;

public class PairWithGivenSum {

    static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            // Check if required pair exists
            if (set.contains(target - num)) {
                System.out.println("Pair found: " + num + " and " + (target - num));
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // array elements
        }

        int target = sc.nextInt(); // target sum

        if (!hasPair(arr, target)) {
            System.out.println("No pair found");
        }

    }
}
