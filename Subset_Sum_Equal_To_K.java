
import java.util.*;
public class Subset_Sum_Equal_To_K {
    //Tabulation approach is shown here
    public static boolean subsetSumToK(int n, int k, int arr[]){
        boolean[][] dp=new boolean[n+1][k+1];
        for (int i=0;i<=n;i++) dp[i][0]=true;
        for (int i = 1; i <= k; i++) {
            dp[0][i] = false;
        }
    for (int ind=1;ind<=n;ind++){
        for (int target=1;target<=k;target++){
            dp[ind][target]=dp[ind-1][target];
            if (arr[ind - 1] <= target) {
                    dp[ind][target] = dp[ind][target] || dp[ind - 1][target - arr[ind - 1]];
                }
        }
    }
           return dp[n][k];

    }
}
