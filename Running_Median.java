
import java.util.*;
public class Running_Median {

	public static void findMedian(int arr[])  {

        int n = arr.length;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());         
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int median;

        
        for(int i = 1; i <= n; i++) 
        {
            if(!maxHeap.isEmpty() && maxHeap.peek() > arr[i-1]) 
            {    
                
                maxHeap.add(arr[i - 1]);

                if(maxHeap.size() > minHeap.size() + 1) 
                {    
                   
                   minHeap.add(maxHeap.poll());          
                }
            } 
            else 
            {
                minHeap.add(arr[i - 1]);

                if(minHeap.size() > maxHeap.size() + 1) 
                {    
 
                    maxHeap.add(minHeap.poll());
                }
            }
          
            if(i% 2 == 1) 
            {
                if(minHeap.size() > maxHeap.size()) 
                {
                    median = minHeap.peek();
                } 
                else 
                {
                    median = maxHeap.peek();
                }
            } 
            else 
            {
                median = (maxHeap.peek() + minHeap.peek()) / 2;
            }
            System.out.print(median + " ");
        }
    
    }


}