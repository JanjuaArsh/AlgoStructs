import java.util.*;
public class WeightedGraph {
    static class Edge {
        int source;
        int destination;
        int weight;
        double prob;
        public Edge(int source, int destination, int weight, double prob) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
            this.prob = prob;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<Edge> [] adjacencylist;
        int[] profit;
        int[] prob;
        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            profit = new int[vertices];
            prob = new int[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination, int weight, double prob) {
            Edge edge = new Edge(source, destination, weight, prob);
            adjacencylist[source].addFirst(edge); //for directed graph
        }

        public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).destination + " with weight " +  list.get(j).weight);
                }
            }
        }
        double DFSUtil(int i,boolean visited[]) 
        { 
        	double mainres = 0; double branch = 0;
            // Mark the current node as visited and print it 
            visited[v] = true; 
        
      
            // Recur for all the vertices adjacent to this vertex 
            LinkedList<Edge> list = adjacencylist[i];
            for (int j = 0; j <list.size() ; j++) {
            	 if (!visited[j])
            	 {
            		 DFSUtil(j, visited); 
            	 }
            }
            if(list.size() == 0)
            {
            	
            }
            
        } 
        
        public void findresult(){
        	
        	boolean visited[] = new boolean[vertices]; 
        	double result = DFSUtil(1, visited); 
        }
    }
      public static void main(String[] args) {
    	  Scanner in = new Scanner(System.in);
    	  int N = in.nextInt();
    
            Graph graph = new Graph(N);
            
            for(int i=1;i<N;i++)
            {
            	graph.addEgde(in.nextInt(), in.nextInt(), in.nextInt(), in.nextDouble());
            }
            graph.printGraph();
        }
}
