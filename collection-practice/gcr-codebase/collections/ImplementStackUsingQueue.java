import java.util.*;
public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack stack = new Stack();
        //sample operations
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }

    // stack implementation using queue
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        //push element onto stack
        public void push(int x) {
            //step 1: add new element to q2
            q2.add(x);
            //step 2: Move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            //step 3: Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        //pop element from stack
        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return q1.remove();
        }

        //get top element
        public int top() {

            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return q1.peek();
        }
    }
}


