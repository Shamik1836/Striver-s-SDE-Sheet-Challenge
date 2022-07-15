
import java.util.*;
public class Palindrome_Partitioning_II  {
    static boolean isPalindrome(int i,int j,String s){
        while (i<j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static int f(int i,int n,String str,int[] dp){
        if (i==n) return 0;
        int minCost=Integer.MAX_VALUE;
        if (dp[i] != -1) return dp[i];
        for (int j=i;j<n;j++){
            if (isPalindrome(i,j,str)){
                int cost=1+f(j+1,n,str,dp);
                minCost=Math.min(minCost,cost);
            }
        }
        return dp[i]=minCost;
    }
    
	public static int palindromePartitioning(String str) {
	    // Write your code here
   
        int n=str.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
//         If we don't add the -1 to the result then we will get wrong answer sole reason be that ou5r function tries to do a partition at the end
        return f(0,n,str,dp)-1;
	}
}
