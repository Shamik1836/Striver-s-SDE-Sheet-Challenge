
import java.util.*;
import java.io.*;

public class Next_Smaller_Element{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.

        int[] ansArr=new int[n];
        ArrayList<Integer> res=new ArrayList<Integer>();
        Stack<Integer> st=new Stack<>();
        for (int i=n-1;i>=0;i--){
            while (st.size()>0 && st.peek()>=arr.get(i))
                st.pop();
            int ans;
            if (st.size()>0){
                ans=st.peek();
            }else{
                ans=-1;
            }
            ansArr[i]=ans;
            st.push(arr.get(i));
        }
        for (int i=0;i<ansArr.length;i++){
            res.add(ansArr[i]);
        }
        return res;
    }
}