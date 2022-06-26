
import java.util.*;
public class Implement_Stack_Using_Arrays 
 {
    ArrayList<Integer> arr;
    int capacity;
    int top;
    Stack(int capacity){
        arr = new ArrayList<Integer>(capacity);
        for (int i = 0; i < capacity; i++) {
            arr.add(0);
        }
        top = -1;
        this.capacity = capacity;
    }
    void push(int num) {
        // Write your code here.
        if (top!=capacity-1){
            top++;
        arr.set(top,num);
        }
        
    }
    int pop() {
        // Write your code here.
        if (top!=-1){
            top--;
            return arr.get(top+1);
        }else{
            return -1;
        }
        
    }
    int top() {
        // Write your code here.
        if (top!=-1){
            return arr.get(top);
        }else{
            return -1;
        }
        
    }
    int isEmpty() {
        // Write your code here.
        if (top==-1) return 1;
        else return 0;
    }
    int isFull() {
        // Write your code here.
        if (top==capacity-1) return 1;
        else return 0;
    }
}
