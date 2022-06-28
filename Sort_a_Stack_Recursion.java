
import java.util.*;
public class Sort_a_Stack_Recursion  {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
         // If stack is not empty
        if (!stack.empty())
        {
            // Remove the top item
            int x = stack.pop();
 
            // Sort remaining stack
            sortStack(stack);
 
            // Push the top item back in sorted stack
            sortedInsert(stack, x);
        }
	}
    static void sortedInsert(Stack<Integer> s,int x){
        if (s.empty() || x>s.peek()){
            s.push(x);
            return;
        }
        int temp=s.pop();
        sortedInsert(s,x);
        s.push(temp);
    }
}