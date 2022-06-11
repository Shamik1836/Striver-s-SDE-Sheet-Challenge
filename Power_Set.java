import java.util.*;
public class Power_Set {
    static ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> curr=new ArrayList<>();
    private static void solve(ArrayList<Integer> arr,int i){
        
        if (i==arr.size()){
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        solve(arr,i+1);
        curr.add(arr.get(i));
        solve(arr,i+1);
        curr.remove(curr.size()-1);
    }
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
        int i=0;
        solve(arr,0);
        return res;
        
	}
}
