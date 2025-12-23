import java.util.*;
public class ThreeFriends {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {    // Taking input for age and height
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = s.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = s.nextDouble();
        }
        String youngest = findYoungest(names, age);   // Finding youngest friend

        String tallest = findTallest(names, heights);    // Finding tallest friend

        System.out.println("Youngest friend is: " + youngest);
        System.out.println("Tallest friend is: " + tallest);

    
    }

    public static String findYoungest(String[] names, int[] age) {    // Method to find youngest friend

        int minAge = age[0];
        int idx = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                idx = i;
            }
        }

        return names[idx];
    }
    public static String findTallest(String[] names, double[] heights) {     // Method to find tallest friend

        double maxHeight = heights[0];
        int idx = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                idx = i;
            }
        }

        return names[idx];
    }
}


