import java.util.*;
public class NestedTryCatchBlock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input the size of the array
        System.out.print("enter array size: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        //taking index and divisor
        System.out.print("enter index to access: ");
        int idx = s.nextInt();
        System.out.print("enter divisor: ");
        int divisor = s.nextInt();
        try {
            //outer try for array index access
            int value = arr[idx];
            try {
                //inner try for division
                int ans = value/divisor;
                System.out.println("Result: " + ans);

            } catch (ArithmeticException e) {
                //handles divide by zero
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //handles invalid index
            System.out.println("Invalid array index!");
        }
    }
}
