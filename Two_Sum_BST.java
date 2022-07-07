/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/
import java.util.*;
public class  Two_Sum_BST {
    static class BSTIterator{
        private Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
    boolean reverse = true; 
    
    public BSTIterator(BinaryTreeNode root, boolean isReverse) {
        reverse = isReverse; 
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        BinaryTreeNode tmpNode = stack.pop();
        if(reverse == false) pushAll(tmpNode.right);
        else pushAll(tmpNode.left); 
        return tmpNode.data;
    }
    
    private void pushAll(BinaryTreeNode node) {
        while(node != null) {
             stack.push(node);
             if(reverse == true) {
                 node = node.right; 
             } else {
                 node = node.left; 
             }
        }
    }
    }
    public static boolean pairSumBst(BinaryTreeNode root, int k) {
        // Write your code here.
        if (root==null) return false;
        BSTIterator l=new BSTIterator(root,false);
        BSTIterator r=new BSTIterator(root,true);
        int i=l.next();
        int j=r.next();
        while (i<j){
            if (i+j==k) return true;
            else if (i+j<k) i=l.next();
            else j=r.next();
        }
        return false;
    }
}

