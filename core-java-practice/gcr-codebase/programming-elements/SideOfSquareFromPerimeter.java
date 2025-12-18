import java.util.*;
public class SideOfSquareFromPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double perimeter = s.nextDouble(); // input the perimeter of the square
        double side = perimeter / 4; // calculate side length by dividibg perimeter by 4
        System.out.println("the length of the side is :"+side+ " whose perimeter is :"+perimeter);
    }
    
}
