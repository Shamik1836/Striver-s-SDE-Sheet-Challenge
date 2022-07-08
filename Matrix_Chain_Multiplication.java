

public class Matrix_Chain_Multiplication {
    static int dp[][] = new int[102][102];
    static int f(int i,int j,int[] arr,int dp[][]){
        if(i==j) return 0;
        if (dp[i][j] !=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for (int k=i;k<j;k++){
            int steps=arr[i-1]*arr[k]*arr[j]+f(i,k,arr,dp)+f(k+1,j,arr,dp);
            if (steps<min) min=steps;
        }
        return dp[i][j]=min;
    }
	public static int matrixMultiplication(int[] arr , int N) {
		// Write your code here
        for (int i = 0; i < 102; i++) {
            for (int j = 0; j < 102; j++) {
                dp[i][j] = -1;
            }
        }
        return f(1,N-1,arr,dp);
	}
}
