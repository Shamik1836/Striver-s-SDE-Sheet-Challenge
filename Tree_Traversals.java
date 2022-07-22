
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
import java.util.*;
public class Tree_Traversals{
    private static void preorderHelper(BinaryTreeNode<Integer> root,ArrayList<Integer> ans){
        if (root==null){
            return;
        }
        int val=root.data;
        ans.add(val);
        preorderHelper(root.left,ans);
        preorderHelper(root.right,ans);
    }
    private static void inorderHelper(BinaryTreeNode<Integer> root,ArrayList<Integer> res){
        if (root==null){
            return;
        }
        inorderHelper(root.left,res);
        res.add(root.data);
        inorderHelper(root.right,res);
    }
    private static void postorderHelper(BinaryTreeNode<Integer> root,ArrayList<Integer> result){
        if (root==null){
            return;
        }
        
       postorderHelper(root.left,result);
        postorderHelper(root.right,result);
        result.add(root.data);
    }
    public static ArrayList<Integer> getPreorder(BinaryTreeNode<Integer>  root){
        ArrayList<Integer> pre=new ArrayList<>();
        preorderHelper(root,pre);
        return pre;
    }
    public static ArrayList<Integer> getInorder(BinaryTreeNode<Integer>  root){
        ArrayList<Integer> ino=new ArrayList<>();
        inorderHelper(root,ino);
        return ino;
    }
    public static ArrayList<Integer> getpostorder(BinaryTreeNode<Integer>  root){
        ArrayList<Integer> post=new ArrayList<>();
        postorderHelper(root,post);
        return post;
    }
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> preorderList=getPreorder(root);
        ArrayList<Integer> inorderList=getInorder(root);
        ArrayList<Integer> postorderList=getpostorder(root);
        res.add(inorderList);
        res.add(preorderList);
        
        res.add(postorderList);
        return res;
    }
}
