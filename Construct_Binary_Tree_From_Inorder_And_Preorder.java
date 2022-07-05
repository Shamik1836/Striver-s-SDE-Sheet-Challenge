
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.*;

public class Construct_Binary_Tree_From_Inorder_And_Preorder
{
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        //    Write your code here.
        Map<Integer,Integer> inMap=new HashMap<Integer,Integer>();
        for (int i=0;i<inorder.size();i++){
            inMap.put(inorder.get(i),i);
        }
        TreeNode<Integer> root=buildTree(preorder,0,preorder.size()-1,inorder,0,inorder.size()-1,inMap);
        return root;
    }
    public static TreeNode<Integer> buildTree(ArrayList<Integer> preorder,int preStart,int preEnd,ArrayList<Integer> inorder,int inStart,int inEnd,Map<Integer,Integer> inMap){
        if (preStart>preEnd || inStart>inEnd) return null;
        TreeNode<Integer> root=new TreeNode(preorder.get(preStart));
        int inRoot=inMap.get(root.data);
        int numsLeft=inRoot-inStart;
        root.left=buildTree(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,inMap);
        root.right=buildTree(preorder,preStart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd,inMap);
        return root;
    }
}