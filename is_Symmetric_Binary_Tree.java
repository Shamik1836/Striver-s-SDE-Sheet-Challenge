
/*****************************************************************

    Following is the representation for the Binary Tree Node:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

****************************************************************/

public class is_Symmetric_Binary_Tree {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        return isSymmetricHelp(root,root);
    }
    private  static boolean isSymmetricHelp(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2){
        if (root1==null && root2==null)
            return true;
        if( (root1 == null && root2 != null) || (root1 != null && root2 == null) ) {
            return false;
        }
        if (!root1.data.equals(root2.data)) return false;
        return isSymmetricHelp(root1.right,root2.left) && isSymmetricHelp(root1.left,root2.right);
    }
}