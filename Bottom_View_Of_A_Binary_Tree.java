
/*********************************************

    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
        int hd;
        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
            this.hd=0;
        }
    }

*********************************************/

import java.util.*;
class Pair {
    BinaryTreeNode root;
    int level;

    Pair() {
    }

    Pair(BinaryTreeNode root, int level) {
        this.root = root;
        this.level = level;
    }
}
public class Bottom_View_Of_A_Binary_Tree
 {

    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {

        int horizontalDistance = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, BinaryTreeNode> mp = new HashMap<>();

        Queue<Pair> q = new LinkedList<>();
 
        Pair p1 = new Pair(root, 0);
        q.add(p1);
        while (!q.isEmpty()) {
            Pair p = q.poll();


            mp.put(p.level, p.root);
           
            if (p.root.left != null) {
                q.add(new Pair(p.root.left, p.level - 1));
            }
   
            if (p.root.right != null) {
                q.add(new Pair(p.root.right, p.level + 1));
            }
        }
        ArrayList<Integer> bottomView = new ArrayList<>();

        for (int key : mp.keySet()) {
            bottomView.add(key);
        }
    
        Collections.sort(bottomView);
        
            for (int i : bottomView) {
            ans.add(mp.get(i).val);
        }

        return ans;
    }

}
