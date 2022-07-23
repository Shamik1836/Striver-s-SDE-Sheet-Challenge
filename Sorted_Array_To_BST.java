
/****************************************************************

    Following is the class structure of the TreeNode class:

    class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


*****************************************************************/

import java.util.ArrayList;
public class Sorted_Array_To_BST {
    private static TreeNode<Integer> createTree(ArrayList<Integer> arr,int start,int end){
        if (start>end) return null;
        int mid=(start+end)/2;
        TreeNode<Integer> node=new TreeNode(arr.get(mid));
        node.left=createTree(arr,start,mid-1);
        node.right=createTree(arr,mid+1,end);
        return node;
    }
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
        if (n==0) return null;
        return createTree(arr,0,n-1);
    }
}