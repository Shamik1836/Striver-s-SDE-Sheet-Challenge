
import java.util.ArrayList;

public class Single_Element_in_a_sorted_array
{
    public static int uniqueElement(ArrayList<Integer> arr) 
    {
        //    Write your code here.
        int xor=0;
        for (int n:arr){
            xor ^= n;
        }
        return xor;
    }
}
