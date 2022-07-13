
import java.util.*;
public class Cycle_Detection_In_Undirected_Graph_DFS{
    public static boolean checkForCycle (int vertex, ArrayList< ArrayList < Integer > > graph, ArrayList < Boolean > vis, int parent)
    {
        vis.set(vertex, true);

        for (int adjVertex : graph.get(vertex))
        {
            if (vis.get(adjVertex) == false)
            {
                if (checkForCycle (adjVertex, graph, vis, vertex) == true)
                {
                    return true;
                }
            }
            else if (adjVertex != parent)
            {
                return true;
            }
        }

        return false;
    }

    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        ArrayList< ArrayList < Integer > > graph = new ArrayList < ArrayList < Integer > > (n + 1);
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList< Integer >());
        }

        for (int i = 0; i < m; i++)
        {
            graph.get(edges[i][1]).add(edges[i][0]);
            graph.get(edges[i][0]).add(edges[i][1]);
        }
        ArrayList < Boolean> vis = new ArrayList < Boolean > (n + 1);
        for(int i = 0; i <= n; i++){
            vis.add(false);
        }

        for (int i = 1; i <= n; i++)
        {
            if (vis.get(i) == false)
            {
                if (checkForCycle (i, graph, vis, -1) == true)
                {
                    return "Yes";
                }
            }
        }

        return "No";
    }   
}