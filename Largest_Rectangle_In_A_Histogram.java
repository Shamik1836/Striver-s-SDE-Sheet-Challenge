 
import java.util.*;

public class Largest_Rectangle_In_A_Histogram {
  public static int largestRectangle(ArrayList < Integer > heights) {
    // Write your code here.
      Stack<Integer> st=new Stack<Integer>();
      int maxA=0;
      int n=heights.size();
      for (int i=0;i<=n;i++){
          while (!st.empty() && (i==n || heights.get(st.peek()) >= heights.get(i))){
              int height= heights.get(st.peek());
              st.pop();
              int width;
              if (st.isEmpty()) width=i;
              else width=i-st.peek()-1;
              maxA=Math.max(maxA,width*height);
          }
           st.push(i);
      }
      return maxA;
                 
  }
}