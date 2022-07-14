public class Longest_Common_Subsequences {
    static int f(int i,int j,String s,String t,int[][] dp){
        if (i<0 || j<0 ) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        if (s.charAt(i)==t.charAt(j)) return dp[i][j]=1+f(i-1,j-1,s,t,dp);
        return dp[i][j]=Math.max(f(i-1,j,s,t,dp),f(i,j-1,s,t,dp));
    }
	public static int lcs(String s, String t) {
		//Your code goes here
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[n][m];
        for (int i=0;i<=n-1;i++){
            for (int j=0;j<=m-1;j++){
                dp[i][j]=-1;
            }
        }
        return f(n-1,m-1,s,t,dp);
    }

}