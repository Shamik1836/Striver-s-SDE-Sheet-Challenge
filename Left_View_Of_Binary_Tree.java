
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

import java.util.ArrayList;

public class Left_View_Of_Binary_Tree
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> res=new ArrayList<>();
        helper(res,root,0);
        return res;
    }
    static void helper(ArrayList<Integer> ans,TreeNode<Integer> root,int level){
        if (root==null)
            return;
        if (level==ans.size()) ans.add(root.data);
        helper(ans,root.left,level+1);
        helper(ans,root.right,level+1);
    }
}
