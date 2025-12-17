import java.util.*;
public class fibbonaci {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // number till where the series will form
        // Initializing the a two Fibonacci numbers
        int a = 0; // First number 
        int b = 1; //  second number
        //loop for seqeunce upto n numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " "); // Print the current number
            int nextnumber = a + b;
            
            // Updating the values 
            a = b;
            b = nextnumber;
        }
    }
}

