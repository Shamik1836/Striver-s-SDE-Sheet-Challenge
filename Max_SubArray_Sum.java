import java.util.* ;
import java.io.*; 
public class Max_SubArray_Sum {
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        int sum=0,maxi=arr[0];
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (sum>maxi){
                maxi=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return maxi;
	}

}
