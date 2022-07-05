
/*************************************************************
    Following is the Binary Tree node structure

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

public class Predescessor_And_Successor_in_BST {
    private static void helper(BinaryTreeNode<Integer> root,ArrayList<Integer> res){
        if (root==null){
            return;
        }
        helper(root.left,res);
        res.add(root.data);
        helper(root.right,res);
    }
    private static ArrayList<Integer> getInorder(BinaryTreeNode<Integer> root){
        ArrayList<Integer> res=new ArrayList<Integer>();
        if (root==null) return res;
        helper(root,res);
        return res;
    }
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		// Write your code here.
        ArrayList<Integer> inOrder=getInorder(root);
        ArrayList<Integer> res=new ArrayList<>();
        Collections.sort(inOrder);
        int pred=-1,succ=-1;
        for (int i=0;i<inOrder.size();i++){
            if (inOrder.get(i)==key){
                if (i-1 >= 0){
                    pred=inOrder.get(i-1);
                }
                if (i+1 < inOrder.size()){
                    succ=inOrder.get(i+1);
                }
                break;
            }
        }
        res.add(pred);
        res.add(succ);
        return res; 
	}
}