
import java.util.*;
public class Zig_Zag_Traversal_Of_Tree{
    public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {

   
        List<Integer> answer = new ArrayList<>();


        if (root == null) {
            return answer;
        }


        Deque<BinaryTreeNode<Integer>> d = new LinkedList<>();
        d.add(root);
        int level = 1;


        while (!d.isEmpty()) {
           
            int n = d.size();

           
            while (n-- > 0) {
                
                if (level % 2 == 1) {

                    
                    BinaryTreeNode<Integer> backNode = d.getFirst();
                    d.removeFirst();

                    answer.add(backNode.data);

                    if (backNode.left != null) {
                        d.add(backNode.left);
                    }
                    if (backNode.right != null) {
                        d.add(backNode.right);
                    }

                }
                else {

                    BinaryTreeNode<Integer> backNode = d.getLast();
                    d.removeLast();
                    answer.add(backNode.data);

       
                    if (backNode.right != null) {
                        d.addFirst(backNode.right);
                    }
                    if (backNode.left != null) {
                        d.addFirst(backNode.left);
                    }
                }
            }

            level++;
        }
        return answer;
    }
}
