
import java.util.*;
public class Kth_Largest_Elemenet_In_An_Unsorted_Array {

	static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		// Write your code here.
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(K+1);
        for (Integer i:arr){
            pq.add(i);
            if (pq.size()>K){
                pq.poll();
            }
        }
        return pq.poll();
	}
}
