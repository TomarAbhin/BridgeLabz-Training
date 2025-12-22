import java.util.Scanner;
public class ArrayIndexOutOfBoundException {
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = s.nextInt();
        String[] str = new String[n];   // initialize the array
        for (int i = 0; i < n; i++) {  
            str[i] = s.next(); // input the array
        }
        try {           // First call: generate exception (no handling inside method)
            generateException(str);
        } catch (Exception e) {
            System.out.println("program stopped due to an exception.");
        }
        handleException(str);    // Second call: handle exception using try-catch
    }

    public static void generateException(String[] str) {     // Method to generate ArrayIndexOutOfBoundsException
        System.out.println("generating the exception. ");
        System.out.println(str[str.length]);   // exception arises here
    }

    public static void handleException(String[] str) {   // Method to handle ArrayIndexOutOfBoundsException
        try {
            System.out.println("handling exception");
            System.out.println(str[str.length]);    // exception arises here
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }
}


