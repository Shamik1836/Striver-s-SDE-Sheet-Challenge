

import java.util.*;

public class Subset_Sum 
 {
   static void helper(int index,int sum,int[] arr,int N,ArrayList<Integer> sumSubset){
        if (index==N){
            sumSubset.add(sum);
            return;
        }
        helper(index+1,sum+arr[index],arr,N,sumSubset);
        
        helper(index+1,sum,arr,N,sumSubset);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> sumSubset=new ArrayList<>();
        helper(0,0,num,num.length,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

}