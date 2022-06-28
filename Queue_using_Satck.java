
import java.util.Stack;

public class Queue_using_Satck {
    Stack<Integer> s1;
    Stack<Integer> s2;

    Queue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    // EnQueue item to the queue.
    void enQueue(int val) {
        s1.push(val);
    }

    // Dequeue an item from the queue.
    int deQueue() {
        // If both the stacks are empty.
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        // If s2 is empty and s1 has elements.
        else if (s2.isEmpty()) {
            // Before removal transfer all elements from s1 to s2, then remove the top of s2.
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
                s1.pop();
            }
            // Return the top element from s2.
            int tp = s2.peek();
            s2.pop(); 
            return tp;
        }
        else {
            int tp = s2.peek();
            s2.pop();
            return tp;
        }
    }

    // Returns the Front element of the queue.
    int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        else if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
                s1.pop();
            }
            return (s2.peek());
        }
        else {
            return s2.peek();
        }
    }

    // Whether the queue is empty or not.
    boolean isEmpty() {
        return (s1.isEmpty() && s2.isEmpty());
    }
}