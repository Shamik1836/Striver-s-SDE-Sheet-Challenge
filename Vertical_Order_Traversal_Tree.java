
/*
    Time Complexity - O(N)
    Space Complexity - O(N)

    Where N is the number of nodes in the Binary Tree.
*/

import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.LinkedList;

class Pair
{
    public TreeNode<Integer> root;
    public int hDistance;

    // Constructor
    Pair(TreeNode<Integer> root, int hDistance)
    {
        this.root = root;
        this.hDistance = hDistance;
    }
}

public class Vertical_Order_Traversal_Tree
{
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root)
    {
        // Store the final result.
        ArrayList<Integer> result = new ArrayList<Integer>();

        // Base case
        if (root == null)
        {
            return result;
        }

        // Create a map and store vertical order in map.
        Map<Integer, ArrayList<Integer>> store = new TreeMap<Integer, ArrayList<Integer>>();

        // Initial horizontal distance.
        int hd = 0;

        // Every pair of queue contains node and horizontal distance with respect to the root node.
        Queue<Pair> level = new LinkedList<Pair>();

        level.add(new Pair(root, hd));

        while (level.isEmpty() == false)
        {
            // Pop element from the queue.
            Pair temp = level.remove();

            hd = temp.hDistance;

            TreeNode<Integer> node = temp.root;

            // Insert the value of current node correspond to hd.
            ArrayList<Integer> element = store.get(hd);
            if (element == null)
            {
                element = new ArrayList<Integer>();
            }
            element.add(node.data);
            store.put(hd, element);

            // For the left subtree, we pass the HD as the Horizontal distance of root minus 1.
            if (node.left != null)
            {
                level.add(new Pair(node.left, hd - 1));
            }

            // For the right subtree, we pass the HD as Horizontal Distance of root plus 1.
            if (node.right != null)
            {
                level.add(new Pair(node.right, hd + 1));
            }
        }

        // Traverse the map and store node values at every horizontal distance (hd).
        for (Map.Entry<Integer, ArrayList<Integer>> it : store.entrySet())
        {
            for (int i = 0; i < it.getValue().size(); ++i)
            {
                result.add(it.getValue().get(i));
            }
        }

        // Return the vertical order traversal of the given binary tree.
        return result;
    }
}