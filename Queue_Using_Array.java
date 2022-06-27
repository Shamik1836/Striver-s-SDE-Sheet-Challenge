
public class Queue_Using_Array  {
    private int arr[];
    private int front,rear,currSize,cap;
    Queue(){
        arr=new int[100010];
        front=0;
        rear=0;
        currSize=0;
        cap=100010;
    }
    

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
       if (front == rear) {
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        // Implement the enqueue() function

        arr[rear]=data;

        rear=rear+1;
        
        currSize++;
    }

    int dequeue() {
        // Implement the dequeue() function
        if (isEmpty()) {
            return -1;
        }
        int dequ=arr[front];
        front++;
        currSize--;
        if (front == rear) {
            front = 0;
            rear = 0;
        }
        return dequ;
    }

    int front() {
        // Implement the front() function
        if (isEmpty()){
            return -1;
        }
        return arr[front];
    }

}
