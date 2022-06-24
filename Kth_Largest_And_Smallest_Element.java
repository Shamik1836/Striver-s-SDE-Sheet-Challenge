
import java.util.*;


public class Kth_Largest_And_Smallest_Element  {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
       ArrayList<Integer> res=new ArrayList<Integer>();
       PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
        PriorityQueue<Integer> pqMax =new PriorityQueue<Integer>(Collections.reverseOrder()); 
        int largest=0,smallest=0;
       for (int i=0;i<k;i++){
           pq.add(arr.get(i));
           pqMax.add(arr.get(i));
       }
       for (int i=k;i<n;i++){
           if(pq.peek()<arr.get(i)){
               pq.remove();
               pq.add(arr.get(i));
           }
       }
        for (int i=k;i<n;i++){
           if(pqMax.peek()>arr.get(i)){
               pqMax.remove();
               pqMax.add(arr.get(i));
           }
       }
        largest=pq.peek();
        smallest=pqMax.peek();
        res.add(smallest);
        res.add(largest);
        
        return res;
	}
}
