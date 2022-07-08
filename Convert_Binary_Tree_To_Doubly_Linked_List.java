

/*************************************************************
 class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*************************************************************/


public class Convert_Binary_Tree_To_Doubly_Linked_List {
    static BinaryTreeNode<Integer> prev=null;
    static BinaryTreeNode<Integer> head=null;
	static void convertToDLL(BinaryTreeNode<Integer> root){
        if (root==null) return;
        convertToDLL(root.left);
        if (prev==null) head=root;
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        convertToDLL(root.right);
    }
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		// Write your code here
        head = null;
        prev = null;
        convertToDLL(root);
        return head;
	}
	

}
