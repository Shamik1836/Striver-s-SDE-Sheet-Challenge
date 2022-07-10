public class Min_Path_Sum_In_A_Grid{
    static int dp[][] = new int[102][102];
    static int f(int i,int j,int[][] grid,int[][] dp){
        if (i<0 || j<0) return (int)Math.pow(10,9);
        if (i==0 && j==0) return grid[0][0];
        if (dp[i][j] != -1) return dp[i][j];
       
        int up=grid[i][j]+f(i-1,j,grid,dp);
        int left=grid[i][j]+f(i,j-1,grid,dp);
        return dp[i][j]=Math.min(left,up);
    }
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int n=grid.length;
        int m=grid[0].length;
        for (int i = 0; i < 102; i++) {
            for (int j = 0; j < 102; j++) {
                dp[i][j] = -1;
            }
        }
        return f(n-1,m-1,grid,dp);
    }
}