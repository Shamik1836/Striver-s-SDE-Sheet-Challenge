
import java.util.*;

public class Count_Distinct_Elements_in_window_of_size_k {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
        int n=arr.size();
        ArrayList<Integer> res=new ArrayList<Integer>(n-k+1);
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<k;i++){
            Integer j = map.get(arr.get(i));
            map.put(arr.get(i), (j == null) ? 1 : j + 1);
        }
        res.add(map.size());
        for (int i=k;i<arr.size();i++){
            int element = arr.get(i - k);
            map.put(element, map.get(element) - 1);
            if (map.get(element) == 0) {
               map.remove(element);
            }
            Integer j = map.get(arr.get(i));
            map.put(arr.get(i), (j == null) ? 1 : j + 1);
            res.add(map.size());
        }
        return res;
	}
}
