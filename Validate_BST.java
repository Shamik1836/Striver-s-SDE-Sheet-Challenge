 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/
public class Validate_BST{
    private static boolean isValidBST(BinaryTreeNode<Integer> root,Integer minVal,Integer maxVal){
        if (root==null) return true;
        if (root.data>maxVal||root.data<minVal) return false;
        return  isValidBST(root.left,minVal,root.data) &&
            isValidBST(root.right,root.data,maxVal);
    }
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        // Write your code here
        return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
