import java.util.*;
public class Rat_In_A_Maze {
    private static void insertCurrentState(int[][] visited,ArrayList<ArrayList<Integer>> ans,int n){
        ArrayList<Integer> currentState=new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                currentState.add(visited[i][j]);
            }
        }
        ans.add(currentState);
    }
    private static void solveMaze(int[][] maze,int[][] visited, ArrayList<ArrayList<Integer>> ans,int x,int y,int n){
        if (x==n-1 && y==n-1){
            visited[x][y]=1;
            insertCurrentState(visited,ans,n);
            return;
        }
        if (x>n-1 || x<0 || y>n-1 || y<0){
            return;
        }
        if (maze[x][y]==0 || visited[x][y]==1){
            return;
        }
        visited[x][y]=1;
        solveMaze(maze,visited,ans,x-1,y,n);
        solveMaze(maze,visited,ans,x+1,y,n);
        solveMaze(maze,visited,ans,x,y-1,n);
        solveMaze(maze,visited,ans,x,y+1,n);
        visited[x][y]=0;
    }
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
       int[][] visited=new int[n][n];
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
       solveMaze(maze,visited,ans,0,0,n);
        return ans;
    } 
}
