import java.util.*;

public class StockSpan {

    static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {

            // Pop while current price is higher than or equal to stack top price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, price is higher than all previous days
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // number of days
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt(); // stock prices
        }

        int[] result = calculateSpan(prices);

        System.out.println("Stock Spans:");
        for (int s : result) {
            System.out.print(s + " ");
        }
    }
}
