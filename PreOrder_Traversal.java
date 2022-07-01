
/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/
import java.util.*;
public class PreOrder_Traversal {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> l=new ArrayList<Integer>();
        helper(root,l);
        return l;
    }
    private static void helper(TreeNode root,List<Integer> ans){
        if (root==null){
            return;
        }
        ans.add(root.data);
        helper(root.left,ans);
        helper(root.right,ans);
    }
}