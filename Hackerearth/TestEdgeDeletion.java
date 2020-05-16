import java.io.*;
import java.util.*;


public class TestEdgeDeletion {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;
        LinkedList<Integer>[] adjList = new LinkedList[N+1];
        long[] weight = new long[N+1];
        int[] node = new int[N];
        int[] parent = new int[N+1];
        parent[1] = 1;
        for(int i=0; i<N; i++)
        {
            node[i] = sc.nextInt();
        }
        for(int i=1; i<N+1; i++)
        {
            weight[i] = (long)node[i-1];
        }
        for(int i=1; i<N+1; i++)
        {
            adjList[i] = new LinkedList();;
        }
        for(int i=0; i<N-1; i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList[u].add(v);
            adjList[v].add(u);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        
        	queue.add(1);
        	while(!queue.isEmpty())
        	{
        		int u = queue.poll();
        		LinkedList<Integer> l =  adjList[u];
        		while(!l.isEmpty())
        		{
        			int ele = l.getFirst();
        			l.removeFirst();
        			queue.add(ele);
        			if(parent[ele] == 0)
        			parent[ele] = u;
        		}
        	}
       
        for(int i=N; i>1; i--)
        {
            long nodeWeight = weight[i];
            long parentWeight = weight[parent[i]];
            if(nodeWeight + parentWeight > (long)K)
            {
                result++;
            }
            else
            {
                weight[parent[i]] = nodeWeight + parentWeight;
            }
        }
        System.out.println(result);
    }
}