
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class Construct_BST_From_PreOrder_Traversal {
 
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
 		// Write your code here
        return bstFromPreorder(preOrder,Integer.MAX_VALUE,new int[]{0});
	}
    public static TreeNode<Integer> bstFromPreorder(int[] A,int uBound,int[] i){
        if (i[0]==A.length|| A[i[0]] > uBound) return null;
        TreeNode<Integer> root=new TreeNode(A[i[0]++]);
        root.left=bstFromPreorder(A,root.data,i);
        root.right=bstFromPreorder(A,uBound,i);
        return root;
    }

}
