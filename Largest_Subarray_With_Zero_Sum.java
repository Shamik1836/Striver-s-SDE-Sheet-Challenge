import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Largest_Subarray_With_Zero_Sum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int maxi=0;
        int sum=0;
        for (int i=0;i<arr.size();i++){
            sum += arr.get(i);
            if (sum==0){
                maxi=i+1;
            }
            else{
                if (mp.get(sum) != null){
                    maxi=Math.max(maxi,i-mp.get(sum));
                }else{
                    mp.put(sum,i);
                }
            }
        }
        return maxi;
	}
}
