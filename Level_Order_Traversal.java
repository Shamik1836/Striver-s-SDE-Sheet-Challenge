 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.*;

public class Level_Order_Traversal{

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
      Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
      ArrayList<Integer> resList=new ArrayList<>();
      if (root==null) return resList;
      queue.offer(root);
      while (!queue.isEmpty()){
          int levelNum=queue.size();
         while (levelNum>0)
         {
             levelNum--;
             BinaryTreeNode currVal=queue.poll();
             resList.add(currVal.val);
             if (currVal.left != null) queue.add(currVal.left);
             if (currVal.right != null) queue.add(currVal.right);
         }   
      }
      return resList;
  }

}