public class M-Coloring{


    private static boolean isCorrect(int[][] mat, int cur, int[] color, int col) {
        
 
        for (int i = 0; i < mat.length; ++i) {

            if (mat[cur][i] == 1 && color[i] == col) {
                return false;
            }
        }

       
        return true;
    }
    
    
    private static boolean graphCol(int[][] mat, int m, int cur, int[] color) {
        

        if (cur == mat.length) {
            return true;
        }

  
        for (int j = 1; j <= m; ++j) {
            if (isCorrect(mat, cur, color, j)) {
                color[cur] = j;
                
                
                if (graphCol(mat, m, cur + 1, color)) {
                    return true;
                }
                color[cur] = 0;
            }
        }

        return false;
    }

   
    public static String graphColoring(int[][] mat, int m) {
        int v = mat.length;
        
        // Initialize color list
        int[] color = new int[v];
        if (graphCol(mat, m, 0, color)) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}