
import java.util.*;
public class Remove_Duplicates_From_Sorted_Array{
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
        if (n==0)
            return 0;
        int i=0;
        for (int j=1;j<n;j++){
            if (arr.get(j) != arr.get(i)){
                i++;
                int val=arr.get(j);
                arr.set(i,val);
            }
        }
        return i+1;
	}
}