import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Search_A_2D_Matrix {
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
        if (mat.size()==0){
            return false;
        }
        int low=0,high=(n*m)-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (mat.get(mid/n).get(mid%n)==target){
                return true;
            }else if (mat.get(mid/n).get(mid%n)<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
	}
}
