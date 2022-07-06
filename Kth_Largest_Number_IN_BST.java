
/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.*;

public class Kth_Largest_Number_IN_BST {
     private static void helper(TreeNode<Integer> root,ArrayList<Integer> res){
        if (root==null) return;
        helper(root.left,res);
        res.add(root.data);
        helper(root.right,res);
    }
    private static ArrayList<Integer>getInOrderTraversal(TreeNode<Integer> root){
        ArrayList<Integer> res=new ArrayList<>();
        if (root==null) return res;
        helper(root,res);
        return res;
    }
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		// Write your code here.
        ArrayList<Integer> inOrder=getInOrderTraversal(root);
        if (inOrder.size()-k>=0)
            return inOrder.get(inOrder.size()-k);
        else
            return -1;
        
	}
}