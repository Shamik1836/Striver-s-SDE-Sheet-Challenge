
import java.util.*;
public class K_Most_Frequent_Elements_In_Array{

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
        if (k==n){
            return arr;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int element:arr){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n2) - map.get(n1));
        for (int key : map.keySet()) {

            heap.add(key);
        }

        int[] ans = new int[k];

     
        for (int i = 0; i < k; i++) {

            ans[i] = heap.poll();
        }

        return ans;
	}

}
