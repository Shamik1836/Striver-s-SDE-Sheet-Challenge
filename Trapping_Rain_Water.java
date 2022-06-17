
import java.util.* ;
import java.io.*; 
public class Trapping_Rain_Water  {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
//         int n=arr.length;
        int left=0;
        int right=n-1;
        long res=0l;
        long maxLeft=0l,maxRight=0l;
        while (left<=right){
            if (arr[left]<=arr[right]){
                if (arr[left]>=maxLeft) maxLeft=arr[left];
                else res+= maxLeft-arr[left];
                left++;
            }else{
                if (arr[right]>=maxRight) maxRight=arr[right];
                else res+=maxRight-arr[right];
                right--;
            }
        }
        return res;
    }
}
