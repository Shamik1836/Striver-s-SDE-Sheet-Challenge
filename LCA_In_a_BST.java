
/*

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

*/
public class LCA_In_a_BST
{

	public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        // Write your code here
        if (root==null) return null;
        int curr=root.data;
        if (curr<p.data && curr<q.data){
            return LCAinaBST(root.right,p,q);
        }
        if (curr>p.data && curr>q.data){
            return LCAinaBST(root.left,p,q);
        }
        return root;
	}
}