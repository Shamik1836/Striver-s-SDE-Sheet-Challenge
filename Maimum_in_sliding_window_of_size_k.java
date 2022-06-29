

import java.util.Deque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Maimum_in_sliding_window_of_size_k
{

    public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k)
    {

        int n = nums.size();

        
        Deque<Integer> window = new LinkedList<Integer>();

        ArrayList<Integer> result = new ArrayList<Integer>(n - k + 1);

        for (int i = 0; i < k - 1; i++)
        {

            
            while (!window.isEmpty() && nums.get(window.getLast()) < nums.get(i))
            {
                window.pollLast();
            }

            //    Add new element at rear of queue.
            window.addLast(i);
        }

        for (int i = k - 1; i < n; i++)
        {
            
            if (!window.isEmpty() && window.getFirst() <= i - k)
            {
                window.pollFirst();
            }

            
            while (!window.isEmpty() && nums.get(window.getLast()) < nums.get(i))
            {
                window.pollLast();
            }

                window.addLast(i);

            
            result.add( nums.get(window.getFirst()));
        }

        return result;
    }
}