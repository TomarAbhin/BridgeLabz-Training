import java.util.*;
public class PerimeterOfRectenglele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt(); // length of the rectangle
        int b = s.nextInt(); // breadth of the rectangle
        int p = 2 * (l + b); // Perimeter calculation
        System.out.println("The perimeter is: " + p);
    }
    
}
