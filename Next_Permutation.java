 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;
public class Next_Permutation
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        int n=permutation.size();
        if (permutation==null||permutation.size()<=1) return permutation;
        int i=permutation.size()-2;
        while (i>=0 && permutation.get(i)>=permutation.get(i+1)) i--;
        if (i>=0){
            int j=permutation.size()-1;
            while (permutation.get(j)<=permutation.get(i)) j--;
            Collections.swap(permutation,i,j);
        }
        reverse(permutation,i+1,permutation.size()-1);
        return permutation;
	}
    static void reverse(ArrayList<Integer> permutation,int i,int j){
        while (i<j) Collections.swap(permutation,i++,j--);
    }
}
