import java.util.Iterator;
import java.util.LinkedList;

public class DFSTransversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    DFSTransversal(int V){
        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i ++){
            adj[i] = new LinkedList<Integer>();
        }

    }

    void InsertEdge(int src, int dest){
        adj[src].add(dest);
    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n = it.next();
            if (!visited[n]){
                DFS(n);
            }
        }
    }

    public static void main(String[] args) {
        DFSTransversal graph = new DFSTransversal(12);
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
        System.out.println("Depth First Transversal For The Graph Is: ");
        graph.DFS(1);
    }

}
