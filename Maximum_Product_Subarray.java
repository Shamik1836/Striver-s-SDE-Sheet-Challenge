
import java.util.ArrayList;
public class Maximum_Product_Subarray{
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
        int max_overall=arr.get(0);
        int max_ending_here=arr.get(0),min_ending_here=arr.get(0);
        for (int i=1;i<n;i++){
            int tmp=max_ending_here;
            max_ending_here=Math.max(Math.max(arr.get(i),arr.get(i)*max_ending_here),arr.get(i)*min_ending_here);
             min_ending_here=Math.min(Math.min(arr.get(i),arr.get(i)*tmp),arr.get(i)*min_ending_here);
            max_overall=Math.max(max_overall,max_ending_here);
        }
        return max_overall;
	}
}