import java.util.*;
public class ReverseAQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();   //initialize the queue

        System.out.print("enter number of elements: ");
        int n = s.nextInt();
        System.out.println("enter queue elements:");
        for (int i = 0; i < n; i++) {
            queue.add(s.nextInt());
        }
        System.out.println("Original Queue: " + queue);

        reverseQueue(queue);  //call the method
        System.out.println("Reversed Queue: " + queue);

    }

    //method to reverse a queue
    public static void reverseQueue(Queue<Integer> queue) {
        // Base case
        if (queue.isEmpty()) {
            return;
        }

        // Remove front element
        int front = queue.remove();
        // Reverse remaining queue
        reverseQueue(queue);
        // Add removed element at rear
        queue.add(front);
    }
}


