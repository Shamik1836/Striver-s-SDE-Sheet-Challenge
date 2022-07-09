
/***************************************************************************

  Class for graph node is as follows:

  class graphNode {
      public int data;
      public ArrayList<graphNode> neighbours;

      graphNode() {
          data = 0;
          neighbours = new ArrayList<graphNode>();
      }

      graphNode(int val) {
          data = val;
          neighbours = new ArrayList<graphNode>();
      }

      graphNode(int val, ArrayList<graphNode> neighbours) {
          data = val;
          this.neighbours = neighbours;
      }
    }

******************************************************************************/
import java.util.*;
public class Clone_Graph_using_BFS {
    public static graphNode cloneGraph(graphNode node) {
        // Write your code here.
        if (node==null){
            return node;
        }
        Map<graphNode,graphNode>map=new HashMap<>();
        Queue<graphNode> qu=new LinkedList<>();
        graphNode newNode=new graphNode();
        newNode.data=node.data;
        map.put(node,newNode);
        qu.offer(node);
        while (!qu.isEmpty()){
            int size=qu.size();
            while (size-->0){
                graphNode originalNode=qu.poll();
                for (graphNode child: originalNode.neighbours){
                    if (!map.containsKey(child)){
                        graphNode newChild=new graphNode();
                        newChild.data=child.data;
                        qu.offer(child);
                        map.put(child,newChild);
                    }
                    graphNode newListNode=map.get(originalNode);
                    newListNode.neighbours.add(map.get(child));
                }
            }
        }
        return map.get(node);
    }
}