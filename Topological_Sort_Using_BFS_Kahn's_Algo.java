
import java.util.*;
public class Topological_Sort_Using_BFS_Kahn's_Algo
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < v; i++) 
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0 ; i<edges.size() ; i++)
        {
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }
        ArrayList<Integer> topo=new ArrayList<>();
        int[] indegree=new int[v];
        for (int i=0;i<v;i++){
             ArrayList<Integer> temp = (ArrayList<Integer>)adj.get(i);
            for (int node : temp) 
            {
                indegree[node]++;
            }
        }
        Queue<Integer> q=new LinkedList<Integer>();
        for (int i=0;i<v;i++){
            if (indegree[i]==0){
                q.add(i);
            }
        }
        
        while (!q.isEmpty()){
            Integer source=q.poll();
            topo.add(source);
            for (int node : adj.get(source)){
                indegree[node]--;
                if (indegree[node]==0){
                    q.add(node);
                }
            }
        }
        return topo;
    }
}
