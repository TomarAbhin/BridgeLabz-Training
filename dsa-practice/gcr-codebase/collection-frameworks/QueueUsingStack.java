import java.util.*;
public class QueueUsingStack {
    Stack<Integer> stackEnqueue = new Stack<>();
    Stack<Integer> stackDequeue = new Stack<>();

    // Enqueue operation
    void enqueue(int value) {
        stackEnqueue.push(value);
    }

    // Dequeue operation
    int dequeue() {
        if (stackDequeue.isEmpty()) {
            // Transfer elements only when dequeue stack is empty
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        if (stackDequeue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stackDequeue.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}


