import java.util.*;
public class BinaryNumbersUsingQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the value of N: ");
        int n = s.nextInt();

        generateBinaryNumbers(n);   //calling method
    }

    //method to generate binary numbers
    public static void generateBinaryNumbers(int n) {
        if (n <= 0) {
            return;
        }
        Queue<String> queue = new LinkedList<>();

        //step 1: Add first binary number
        queue.add("1");
        System.out.print("Binary Numbers: ");

        //step 2: Generate N binary numbers
        for (int i = 0; i < n; i++) {
            //remove front element
            String current = queue.remove();
            System.out.print(current + " ");
            //add next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}

