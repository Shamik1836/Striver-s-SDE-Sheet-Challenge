
/*
    Time complexity: O( max(M, N) ) 
    Space complexity: O( max(M, N) )
    
    M and N are number of nodes in binary tree 1 and binary tree 2 respectively.
*/
    
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Is_Trees_Identical {
    
    public static ArrayList<Integer> createLevelOrder(BinaryTreeNode<Integer> root) {
    
        // Res will store level order traversal of the tree. 
        ArrayList<Integer> res = new ArrayList();
        
        if(root == null) {
            res.add(-1);
            return res;
        }
        
        // Using queue to implement level order traversal. 
        Queue<BinaryTreeNode<Integer>> q = new LinkedList();
        
        q.add(root);
        res.add(root.data);
        
        while(!q.isEmpty()) {
            
            BinaryTreeNode<Integer> first = q.poll();
            
            // Push the left child into queue   
            if(first.left != null) {
                q.add(first.left);
                res.add(first.left.data);
            }
            else {
                // Push -1 for null node. 
                res.add(-1);
            }
            
            // Push the right child into queue  
            if(first.right != null) {
                q.add(first.right);
                res.add(first.right.data);
            }
            else {
                // Push -1 for null node. 
                res.add(-1);
            }

        }
        
        return res;

    }

    public static boolean identicalTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        
        // Store level order of tree 1 in arr1.      
        ArrayList<Integer> arr1 = createLevelOrder(root1);
        
        // Store level order of tree 2 in arr2. 
        ArrayList<Integer> arr2 = createLevelOrder(root2);
        
        if(arr1.size() != arr2.size()) {
            return false;
        }
        
        // Check if level order is same or not. 
        for(int i = 0; i < arr1.size(); i++) {
            if(!arr1.get(i).equals(arr2.get(i))) {
                return false;
            }
        }
        
        return true;
            
    }

}