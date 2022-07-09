
import java.util.*;
public class Kth_Largest_Element_in_a_Stream{
    private final PriorityQueue<Integer> minHeap;
    private final int k;
    Kthlargest(int k, int[] arr) {
        // Write your code here.
        this.k=k;
        minHeap=new PriorityQueue<>();
        for (Integer el:arr){
            add(el);
        }
    }

    void add(int num) {
        // Write your code here.
        minHeap.add(num);
        if (minHeap.size()>k){
            minHeap.poll();
        }
    }

    int getKthLargest() {
        // Write your code here.
        return minHeap.peek();
    }
}
