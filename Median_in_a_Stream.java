
import java.util.*;
public class Median_in_a_Stream{
    public static int[] findMedian(int[] arr, int n) {
        // Write your code here.
        int[] ans=new int[n];
        //min heap
        PriorityQueue<Integer> left=new PriorityQueue<>(Collections.reverseOrder());
        //max heap
           PriorityQueue<Integer> right=new PriorityQueue<>();
        for (int i=0;i<n;i++){
            left.add(arr[i]);
            right.add(left.poll());
            if (left.size()<right.size()){
                left.add(right.poll());
            }
            int median;
        if (left.size()>right.size()){
            median=left.peek();
        }else{
            median=(left.peek()+right.peek())/2;
        }
        ans[i]=median;
        }
        return ans;
    }
}
