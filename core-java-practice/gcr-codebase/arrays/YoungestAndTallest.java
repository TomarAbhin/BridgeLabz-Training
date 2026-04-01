import java.util.*;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) { 
            System.out.println("Enter age of " + name[i]);  // input the age 
            age[i] = sc.nextInt();
            System.out.println("Enter height of " + name[i]);  //input the height
            height[i] = sc.nextDouble();
        }
        int youngest = 0;
        int tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;   // Update youngest index
            }
            if (height[i] > height[tallest]) {
                tallest = i;    // Update tallest index
            }
        }
        System.out.println("Youngest Friend: " + name[youngest] + " Age: " + age[youngest] );
        System.out.println("Tallest Friend: " + name[tallest] + " Height: " + height[tallest] );
    }
}