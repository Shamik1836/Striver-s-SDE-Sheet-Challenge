
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair 
{
    int first, second;
    
    Pair(int first, int second) 
    {
        this.first = first;
        this.second = second;
    }
}

class PqComparator implements Comparator<Pair> 
{
    public int compare(Pair p1, Pair p2) 
    {
        if (p1.first < p2.first) 
        {
            return -1;
        }
        return 1;
    }
}

public class Prim's_MST 
{
    
    private static ArrayList<ArrayList<Integer>> primsMST(ArrayList<Pair>[] adjList, int n) 
    {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new PqComparator());

 
        int src = 0;

       
        ArrayList<Integer> weight = new ArrayList<Integer>(n);

  
        ArrayList<Integer> parent = new ArrayList<Integer>(n);

        
        ArrayList<Boolean> inMST = new ArrayList<Boolean>(n);

        for (int i = 0; i < n; i++) 
        {
            weight.add( Integer.MAX_VALUE);
            parent.add( -1);
            inMST.add( false);
        }


        inMST.set(src, true);


        pq.add(new Pair(0, src));


        weight.set(src, 0);

        while (!pq.isEmpty()) 
        {
         

            int u = pq.remove().second;

       
            inMST.set(u, true);

        
            for (Pair x : adjList[u]) 
            {
                int v = x.first;
                int wt = x.second;

                if (!inMST.get(v) && weight.get(v) > wt) 
                {
               
                    weight.set(v, wt);

               
                    pq.add(new Pair(weight.get(v), v));

                    parent.set(v, u);
                }
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 1; i < n; i++) 
        {
            result.add(new ArrayList<Integer>());

            result.get(i - 1).add(parent.get(i) + 1);
            result.get(i - 1).add(i + 1);
            result.get(i - 1).add(weight.get(i));
        }

        return result;
    }

    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> g) 
    {
        ArrayList<Pair> []graph = new ArrayList[n];

        for (int i = 0; i < n; i++) 
        {
            graph[i] = new ArrayList<Pair>();
        }


        for (int i = 0; i < m; i++) 
        {
            graph[g.get(i).get(0) - 1].add(new Pair(g.get(i).get(1) - 1, g.get(i).get(2)));
            graph[g.get(i).get(1) - 1].add(new Pair(g.get(i).get(0) - 1, g.get(i).get(2)));
        }

        return primsMST(graph, n);
    }
}