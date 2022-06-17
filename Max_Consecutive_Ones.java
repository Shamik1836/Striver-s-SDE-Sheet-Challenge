
import java.util.ArrayList;

public class Max_Consecutive_Ones  {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
        int cnt0=0;
        int maxi=0;
        int l=0;
        for (int r=0;r<n;r++){
            if (arr.get(r)==0)
                cnt0++;
             while (cnt0 > k) {
                if (arr.get(l) == 0) {
                    cnt0--;
                }

                l++;
            }
            maxi = Math.max(maxi, r - l + 1);
        }
        return maxi;
	}
}