public class Rod_Cutting_Problem {
    static int f(int ind,int N,int[] price,int[][]dp){
     if (ind==0){
         return N*price[0];
     }
     if (dp[ind][N] != -1) return dp[ind][N];
     int notTake=0+f(ind-1,N,price,dp);
     int take=Integer.MIN_VALUE;
     int rodLength=ind+1;
     if (rodLength<=N){
         take=price[ind]+f(ind,N-rodLength,price,dp);
     }
     return dp[ind][N]=Math.max(take,notTake);
 }
     public static int cutRod(int price[], int n) {
         // Write your code here.
         int[][] dp=new int[n+2][n+2];
         for (int i=0;i<n+2;i++){
             for (int j=0;j<n+2;j++){
                 dp[i][j]=-1;
             }
         }
          return f(n-1,n,price,dp);
     }
 }
 
 