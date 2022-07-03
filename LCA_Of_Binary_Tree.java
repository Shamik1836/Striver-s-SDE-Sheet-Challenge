

public class LCA_Of_Binary_Tree 
{
   
    private static int findLCA(TreeNode<Integer> root, int x, int y) 
    {
        if (root == null) 
        {
          
            return -1;
        } 
        else if (root.data == x || root.data == y) 
        {
           
            return root.data;
        } 
        else 
        {
            int leftLCA = findLCA(root.left, x, y);

       
            int rightLCA = findLCA(root.right, x, y);

            if (leftLCA != -1 && rightLCA != -1) 
            {
                
                return root.data;
            } 
            else if (leftLCA != -1) 
            {
               
                return leftLCA;
            } 
            else 
            {
              
                return rightLCA;
            }
        }
    }

    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) 
    {
        int lca = findLCA(root, x, y);
        return lca;
    }
}

