


import java.util.Stack;
import java.util.ArrayList;
public class Online_Stock_Span
{
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
  
        int n = price.size();

   
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++) {
            result.add(0);
        }

        Stack<Integer> stk = new Stack<Integer>();

        for(int i = 0; i < n; i++) {
       
            while(stk.isEmpty() == false && price.get(stk.peek()) <= price.get(i)) {    
                stk.pop();
            }

            //  Span on day 'i'.
            if(stk.isEmpty() == true) {
                result.set(i, i + 1);
            }
            else {
                result.set(i, i - stk.peek());
            }
            stk.push(i);
        }
        return result;        
    }
}