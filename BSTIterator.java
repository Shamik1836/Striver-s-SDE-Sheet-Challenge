
/*
    Definition of Node class for reference

    class TreeNode<T> 
    {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

*/
import java.util.*;
public class BSTIterator {
 private static Stack<TreeNode> st=new Stack<TreeNode>();
    static class BSTIterator{
       
        BSTIterator(TreeNode<Integer> root){
            // Write your code here
            pushAll(root);
        }

        int next(){
            // Write your code here
            TreeNode<Integer> tmp=st.pop();
            pushAll(tmp.right);
            return tmp.data;
        }

        boolean hasNext(){
            // Write your code here
            return !st.isEmpty();
        }
        private void pushAll(TreeNode<Integer> node){
            for (;node != null;st.push(node),node=node.left);
        }
    }
}

/*
    Your BSTIterator object will be instantiated and called as such:
    BSTIterator iterator = new BSTIterator(root);
    while(iterator.hasNext())
    {
       print(iterator.next()+" ");
    }
*/
