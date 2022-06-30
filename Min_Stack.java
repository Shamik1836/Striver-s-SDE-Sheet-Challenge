import java.util.*;
public class Min_Stack {
    Stack<Long> st;
    Long mini;
    // Constructor
    Min_Stack() {
        // Write your code here.
        st=new Stack<Long>();
        mini=Long.MAX_VALUE;
    }

    // Function to add another element equal to num at the top of stack.
    void push(int num) {
        // Write your code here.
        Long val=Long.valueOf(num);
        if (st.isEmpty()){
            mini=val;
            st.push(val);
        }else{
            if (val<mini){
                st.push(2*val-mini);
                mini=val;
            }else{
                st.push(val);
            }
        }
    }

    // Function to remove the top element of the stack.
    int pop() {
        // Write your code here.
        if (st.isEmpty()) return -1;
        Long val=st.pop();
        if (val<mini){
            mini=2*mini-val;
        }
        return val;
    }

    // Function to return the top element of stack if it is present. Otherwise
    // return -1.
    int top() {
        // Write your code here.
         if (st.isEmpty()) return -1;
        Long val=st.peek();
        if (val<mini){
            return mini.intValue();
        }
        return val.intValue();
    }

    // Function to return minimum element of stack if it is present. Otherwise
    // return -1.
    int getMin() {
        // Write your code here.
        if (st.isEmpty()) return -1;
        else return mini.intValue();
    }
};