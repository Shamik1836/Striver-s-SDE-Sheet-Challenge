
import java.util.*;
public class Edit_Distance{
    static int f(int i,int j,String str1,String str2,int[][] dp){
        if (i<0) return j+1;
        if (j<0) return i+1;
        if (dp[i][j] != -1) return dp[i][j];
        if (str1.charAt(i)==str2.charAt(j)) return dp[i][j]=f(i-1,j-1,str1,str2,dp);
        return dp[i][j]= 1+Math.min(f(i-1,j,str1,str2,dp),Math.min(f(i,j-1,str1,str2,dp),f(i-1,j-1,str1,str2,dp)));
    }
    public static int editDistance(String str1, String str2) {
        //Your code goes here
        int n=str1.length();
        int m=str2.length();
        int[][] dp=new int[n][m];
        for (int i=0;i<=n-1;i++){
            for (int j=0;j<=m-1;j++){
                dp[i][j]=-1;
            }
        }
        
        return f(n-1,m-1,str1,str2,dp);
    }
}