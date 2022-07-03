
/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Diameter_of_a_Binary_Tree {
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
        int[] diameter=new int[1];
        height(root,diameter);
        return diameter[0];
	}
    private static int height(TreeNode<Integer> node,int[] diameter){
        if (node==null){
            return 0;
        }
        int lh=height(node.left,diameter);
        int rh=height(node.right,diameter);
        diameter[0]=Math.max(diameter[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
}