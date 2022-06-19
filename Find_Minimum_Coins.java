
import java.util.*;
public class Find_Minimum_Coins 
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<>();
        int[] deno={1,2,5,10,20,50,100,500,1000};
        for (int i=deno.length-1;i>=0;i--){
            while (amount>=deno[i]){
                amount-=deno[i];
                ans.add(deno[i]);
            }
        }
    return ans.size();
    }
}
