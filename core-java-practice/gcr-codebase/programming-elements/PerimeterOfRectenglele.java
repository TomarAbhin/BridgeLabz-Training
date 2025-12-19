import java.util.*;
public class PerimeterOfRectenglele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt(); // length of the rectangle
        int base = s.nextInt(); // breadth of the rectangle
        int perimeter = 2*(length+base); // Perimeter calculation
        System.out.println("The perimeter is: " + perimeter);
    }
    
}
