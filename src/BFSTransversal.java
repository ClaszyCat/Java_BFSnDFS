import java.util.*;

public class BFSTransversal
{
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;
    BFSTransversal(int v)
    {
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }
    void InsertEdge(int v, int w)
    {
        adj[v].add(w);
    }
    void BFS(int n)
    {
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n] = true;
        que.add(n);
        while (que.size()!=0)
        {
            n = que.poll();
            System.out.print(n+" ");
            for (int i = 0; i<adj[n].size(); i++)
            {
                a = adj[n].get(i);
                if (!nodes[a])
                {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        BFSTransversal graph = new BFSTransversal(12);
        graph.InsertEdge(1,2);
        graph.InsertEdge(2,1);
        graph.InsertEdge(2,5);
        graph.InsertEdge(5,2);
        graph.InsertEdge(5,3);
        graph.InsertEdge(5,7);
        graph.InsertEdge(7,6);
        graph.InsertEdge(5,9);
        graph.InsertEdge(9,5);
        graph.InsertEdge(9,8);
        graph.InsertEdge(8,9);
        graph.InsertEdge(8,11);
        graph.InsertEdge(11,10);
        graph.InsertEdge(1,4);
        graph.InsertEdge(4,6);
        graph.InsertEdge(6,7);
        graph.InsertEdge(7,11);
        System.out.println("Breadth First Traversal for the graph is: ");
        graph.BFS(1);
    }
}