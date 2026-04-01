public class RandomNumberGenerate {
    public static void main(String[] args) {
        int size = 5;      // generate 5 random ans

        int[] ans = generateRandomNumber(size);   // array for storing 4-digit random ans

        System.out.print("Generated 4-digit numbers are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find average, min and max
        double[] result = findAverageMinMax(ans);

        System.out.println("Average value is: " + result[0]);
        System.out.println("Minimum value is: " + result[1]);
        System.out.println("Maximum value is: " + result[2]);
    }

    public static int[] generateRandomNumber(int size) {   // Method to generate array of 4-digit random number
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;   // Generates random number between 1000 and 9999
        }

        return arr;
    }
    public static double[] findAverageMinMax(int[] ans) {   // Method to find average, minimum and maximum of numbers in array

        int sum = 0;
        int min = ans[0];
        int max = ans[0];

        for (int num : ans) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / ans.length;

        return new double[]{average, min, max};
    }
}


