
/*
    ----------------- Binary Tree node class for reference -----------------

    class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;
	    public BinaryTreeNode<T> next;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	        next = null;
	    }
	};

*/
import java.util.*;
public class Connect_Nodes_At_Same_Level {
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	// Write your code here.
        if (root==null) return;
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            int n=q.size();
            BinaryTreeNode<Integer> prev=null;
            for (int i=0;i<n;i++){
                BinaryTreeNode<Integer> curr=q.poll();
                if (prev != null){
                    prev.next=curr;
                }
                prev=curr;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
            prev=null;
        }
	}
}