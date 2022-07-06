
/************************************************************

    Following is the TreeNode class structure

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

************************************************************/

import java.util.*;
public class Kth_Smallest_Number_in_BST 
{
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
	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
        ArrayList<Integer> inOrder=getInOrderTraversal(root);
        return inOrder.get(k-1);
	}

}
