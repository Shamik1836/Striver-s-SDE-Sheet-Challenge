import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Count_No_Of_Subarrays_With_Given_xor {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
        int cnt=0;
        int xor=0;
        int n=arr.size();
        for (int i=0;i<n;i++){
            xor=xor^arr.get(i);
            if (freq.get(xor^x)!= null)
                cnt += freq.get(xor^x);
           if (xor==x)
               cnt++;
            if (freq.get(xor) != null)
                freq.put(xor,freq.get(xor)+1);
            else
                freq.put(xor,1);
        }
        return cnt;
	}
}
