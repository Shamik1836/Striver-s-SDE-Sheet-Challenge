import java.util.ArrayList;

public class Rotate_Matrix{

    public static void rotateMatrixHelper(ArrayList<ArrayList<Integer>> mat, int rowStart, int colStart, int rowEnd,
            int colEnd) {
       
        if (rowStart >= rowEnd || colStart >= colEnd) {
            return;
        }

        if (rowStart >= rowEnd - 1 || colStart >= colEnd - 1) {
            return;
        }

        int previous = mat.get(rowStart + 1).get(colStart);
        int current;


        for (int i = colStart; i < colEnd; i++) {
            current = mat.get(rowStart).get(i);
            mat.get(rowStart).set(i, previous);
            previous = current;
        }

        rowStart++;

       
        for (int i = rowStart; i < rowEnd; i++) {
            current = mat.get(i).get(colEnd - 1);
            mat.get(i).set(colEnd - 1, previous);
            previous = current;
        }
        colEnd--;

     
        if (rowStart < rowEnd) {
            for (int i = colEnd - 1; i >= colStart; i--) {
                current = mat.get(rowEnd - 1).get(i);
                mat.get(rowEnd - 1).set(i, previous);
                previous = current;
            }
        }
        rowEnd--;

    
        if (colStart < colEnd) {
            for (int i = rowEnd - 1; i >= rowStart; i--) {
                current = mat.get(i).get(colStart);
                mat.get(i).set(colStart, previous);
                previous = current;
            }
        }
        colStart++;

        
        rotateMatrixHelper(mat, rowStart, colStart, rowEnd, colEnd);

    }

    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {

        rotateMatrixHelper(mat, 0, 0, n, m);

    }
}