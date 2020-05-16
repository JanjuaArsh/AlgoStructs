import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


class OfficeNetwork 
{ 
    private int V;   // No. of vertices 
    private LinkedList<Integer> adj[]; // Adjacency List Represntation 
  
    // Constructor 
    OfficeNetwork(int v) { 
        V = v; 
        adj = new LinkedList[v]; 
        for(int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    // Function to add an edge into the graph 
    void addEdge(int v,int w) { 
        adj[v].add(w); 
        adj[w].add(v); 
    } 
    Boolean isCyclicUtil(int v, Boolean visited[], int parent) 
    { 
        // Mark the current node as visited 
        visited[v] = true; 
        Integer i; 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> it = adj[v].iterator(); 
        while (it.hasNext()) 
        { 
            i = it.next(); 
  
            // If an adjacent is not visited, then recur for that 
            // adjacent 
            if (!visited[i]) 
            { 
                if (isCyclicUtil(i, visited, v)) 
                    return true; 
            } 
  
            // If an adjacent is visited and not parent of current 
            // vertex, then there is a cycle. 
            else if (i != parent) 
                return true; 
        } 
        return false; 
    } 
    Boolean isCyclic() 
    { 
        // Mark all the vertices as not visited and not part of 
        // recursion stack 
        Boolean visited[] = new Boolean[V]; 
        for (int i = 0; i < V; i++) 
            visited[i] = false; 
  
        // Call the recursive helper function to detect cycle in 
        // different DFS trees 
        for (int u = 0; u < V; u++) 
            if (!visited[u]) // Don't recur for u if already visited 
                if (isCyclicUtil(u, visited, -1)) 
                    return true; 
  
        return false; 
    } 
    
    public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 
		 int N = in.nextInt();
		 int M = in.nextInt();
		 for(int i=0; i<M;i++)
		 {
			 OfficeNetwork g1 = new OfficeNetwork(N);
			 g1.addEdge(in.nextInt(), in.nextInt());
		 }
	}
}
