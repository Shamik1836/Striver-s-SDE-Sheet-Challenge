
import java.util.*;
public class Ways_To_Make_Coin_Change {
    static long f(int n,int T,int[] denominations,long[][] dp){
        if (T == 0){
          return 1;
        }
        if (n< 0 || T < 0) 
        {
            return 0;
        }
        if (dp[n][T] != -1) return dp[n][T];
        long nonTake=f(n-1,T,denominations,dp);
        long take=0;
        if (denominations[n]<=T) take=f(n,T-denominations[n],denominations,dp);
        return dp[n][T]=take+nonTake;
    }
public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here
    int n=denominations.length;
   long[][] dp = new long[n][value + 1];
        
        for (int i = 0; i < n; i++) 
        {
            Arrays.fill(dp[i], -1);
        }
        return f(n-1,value,denominations,dp);
    }

}