
/************************************************************
  
   Following is the TreeNode class structure
   
   class TreeNode<T> { 
        T data; 
        TreeNode<T> left;
        TreeNode<T> right;
  
        TreeNode(T data) { 
            this.data = data; 
            left = null; 
            right = null; 
        }
   }
    
 ************************************************************/
import java.util.*;
public class Construct_Tree_From_Postorder_And_inorder{
	public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postOrder, int[] inOrder) {
		// Write your code here.
        int n = postOrder.length;

        int postStart = 0;
        int postEnd = n - 1;
        int inStart = 0;
        int inEnd = n - 1;

        return buildTreePostIn(postOrder, postStart, postEnd, inOrder, inStart, inEnd);
	}
    private static TreeNode<Integer> buildTreePostIn(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd){
        if (postStart > postEnd || inStart > inEnd) 
        {
            return null;
        }

       
        int rootVal = postOrder[postEnd];
        
        TreeNode<Integer> root = new TreeNode<Integer>(rootVal);

        int k = 0;
      
        for (int i = inStart; i <= inEnd; i++) 
        {
            if (rootVal == inOrder[i]) 
            {
                k = i;
                break;
            }
        }
        root.left = buildTreePostIn(postOrder, postStart, postStart + k - inStart - 1, inOrder, inStart, k - 1);
        root.right = buildTreePostIn(postOrder, postStart + k - inStart, postEnd - 1, inOrder, k + 1, inEnd);

        return root;
    }
}
