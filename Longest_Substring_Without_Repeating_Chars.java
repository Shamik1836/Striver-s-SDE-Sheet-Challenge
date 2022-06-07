import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
        int l=0,r=0,len=0;
        int n=input.length();
        while (r<n){
            if (mp.containsKey(input.charAt(r))){
                l=Math.max(mp.get(input.charAt(r))+1,l);
            }
            mp.put(input.charAt(r),r);
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
	}
}
