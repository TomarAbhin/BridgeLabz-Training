import java.util.*;
public class MeanHeightOfPlayers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0.0;
        for (int i = 0; i < height.length; i++) {    //loop for taking input of height
            System.out.print("enter height of player :");
            height[i] = sc.nextDouble();
        }
        for (int i = 0; i < height.length; i++) {  
            sum += height[i];     // Calculate sum of height
        }
        double mean = sum / height.length;    // Calculate mean height
        System.out.println("Mean height of the football team = " + mean);
    }
}
