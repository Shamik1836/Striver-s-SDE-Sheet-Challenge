 
import java.util.*;
public class Valid_Parenthesis{
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        if (expression.length()%2 != 0) return false;
        Stack<Character> st=new Stack();
        for (char c:expression.toCharArray()){
            if (c=='(' || c=='{' || c=='['){
                st.push(c);
            }else if (c==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }else if (c=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else if (c==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }
}