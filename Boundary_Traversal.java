
/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Boundary_Traversal {
    static void addLeftBoundary(TreeNode root,ArrayList<Integer> res){
        if (root==null || (root.left==null && root.right==null)){
            return;
        }
        res.add(root.data);
        if (root.left != null){
            addLeftBoundary(root.left,res);
        }else{
            addLeftBoundary(root.right,res);
        }
    }
    static void addRightBoundary(TreeNode root, ArrayList<Integer> res){
        if (root==null || (root.left==null && root.right==null)){
            return;
        }
        if (root.right != null) {
            addRightBoundary(root.right, res);
        } 
        
        else {
            addRightBoundary(root.left, res);
        }

        res.add(root.data);
    }
    static void addLeaves(TreeNode root, ArrayList<Integer> res){
        if (root == null) {
            return;
        }
        if(root.left==null && root.right==null){
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left,res);
        if (root.right != null) addLeaves(root.right,res);
    }
	public static  ArrayList<Integer> traverseBoundary(TreeNode root){
		// Write your code here.
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if (root==null) return ans;
        ans.add(root.data);
        addLeftBoundary(root.left,ans);
        addLeaves(root.left,ans);
        addLeaves(root.right,ans);
        addRightBoundary(root.right,ans);
        return ans;
	}
}