import java.util.* ;
import java.io.*; 
public class 3Sum {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new  ArrayList<ArrayList<Integer>>();
        for (int i=0;i<arr.length;i++){
                int lo=i+1;
                int hi=arr.length-1;
                int target=K-arr[i];       
                while (lo<hi){
                    int sum=arr[lo]+arr[hi];
                    if (sum<target){
                        lo++;
                    }else if (sum>target){
                        hi--;
                    }
                    else{
                        int x = arr[lo];
                        int y = arr[hi];
                        ArrayList<Integer> list=new ArrayList<Integer>();
                        list.add(arr[i]);
                        list.add(arr[lo]);
                        list.add(arr[hi]);
                        res.add(list);
                        while (lo<hi && arr[lo]==x) lo++;
                        while (lo<hi && arr[hi]==y) hi--;
                    }
                }
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                i++;
            }
         }
        
        return res;
	}
}
