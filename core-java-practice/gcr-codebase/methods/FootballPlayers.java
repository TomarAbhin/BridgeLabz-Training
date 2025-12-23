public class FootballPlayers {
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {    // Generate random heights for 11 players (150 cm to 250 cm)
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        System.out.print("Heights of players (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calling methods for sum,mean height,finding shortest height and tallest height
        int sum = findSum(heights);
        double mean = findMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        System.out.println("Sum of heights is: " + sum);
        System.out.println("Mean height is: " + mean);
        System.out.println("Shortest height is: " + shortest);
        System.out.println("Tallest height is: " + tallest);
    }

    public static int findSum(int[] heights) {  // Method to find sum of heights

        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMeanHeight(int[] heights) {        // Method to find mean height

        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    public static int findShortestHeight(int[] heights) {   // Method to find shortest height

        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }
    public static int findTallestHeight(int[] heights) {   // Method to find tallest height

        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
