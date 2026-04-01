public class FibbonaciComputation {
    public static void main(String[] args) {
        int[] values = {10, 30, 50};
        for (int n : values) {
            System.out.println("Fibonacci : " + n);

            //recursive fibonacci (O(2^N))
            long startRecursive = System.nanoTime();
            int recursiveResult = fibonacciRecursive(n);
            long endRecursive = System.nanoTime();
            //iterative fibonacci (O(N))
            long startIterative = System.nanoTime();
            int iterativeResult = fibonacciIterative(n);
            long endIterative = System.nanoTime();

            //convert time to milliseconds
            double recursiveTime = (endRecursive - startRecursive)/1_000_000.0;
            double iterativeTime = (endIterative - startIterative)/1_000_000.0;

            
            System.out.println("Recursive Result: " + recursiveResult);
            System.out.println("Recursive Time (O(2^N)): " + recursiveTime + " ms");

            System.out.println("Iterative Result: " + iterativeResult);
            System.out.println("Iterative Time (O(N)): " + iterativeTime + " ms");

        }
    }

    //recursive fibonacci 
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // iterative fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}


