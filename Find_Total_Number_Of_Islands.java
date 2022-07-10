public class Find_Total_Number_Of_Islands
{
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here
         int n = mat.length;
        if (n == 0) 
        {
            return 0;
        }
        int count=0;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if (mat[i][j]==1){
                    count += 1;
                    callBFS(mat,i,j);
                }
            }
        }
        return count;
    }
    public static void callBFS(int[][] grid,int i,int j){
        if (i<0 || i>=grid.length||j<0||j>=grid[i].length||grid[i][j]==0) return;
        grid[i][j]=0;
        callBFS(grid,i+1,j);
        callBFS(grid,i-1,j);
        callBFS(grid,i,j-1);
        callBFS(grid,i,j+1);
        callBFS(grid,i-1,j-1); // NorthWest
        callBFS(grid,i+1,j-1); // SouthWest
       callBFS(grid,i-1,j+1); // NorthEast
       callBFS(grid,i+1,j+1);
    }
}