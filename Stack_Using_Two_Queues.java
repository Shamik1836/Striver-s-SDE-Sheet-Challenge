import java.util.*;
public class Stack_Using_Two_Queues {

    // Define the data members.
    Queue<Integer> q1;
    Queue<Integer> q2;

    public Stack() {
        // Implement the Constructor.
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q1.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(element);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    public int pop() {
        // Implement the pop() function.
        if (q1.isEmpty())
            return -1;
        else
            return q1.poll();
    }

    public int top() {
        // Implement the top() function.
        if (q1.isEmpty())
            return -1;
        else
            return q1.peek();
    }
}