import java.util.*;
public class SortStack {
    // Sort stack using recursion
    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    // Insert element at correct position
    static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, value);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        System.out.println("Sorted Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


