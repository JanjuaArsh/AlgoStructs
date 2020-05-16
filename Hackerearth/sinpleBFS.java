import java.util.*;

public class sinpleBFS
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=0;t<T;t++)
        {
            int N = in.nextInt();
            LinkedList<Integer>[] stars = new LinkedList[N+1];
            int[] rank  = new int[N+1];
            boolean[] visited = new boolean[N+1]; 
            for(int n=1;n<=N;n++)
            {
                stars[n] = new LinkedList<Integer>();
                rank[n] = 0;
                visited[n] = false;
            }
            for(int n=1;n<N;n++)
            {
                int a = in.nextInt();
                int b = in.nextInt();
                //a to b
                stars[a].add(b);
            }
            int startPoint = in.nextInt();
            BFS(stars,N,startPoint,rank,visited);
            int result = 0;
            int max = 0;
            for(int i=N;i>0;i--)
            {
                if(rank[i]>max)
                {
                    max = rank[i];
                    result = i;
                }
            }System.out.println(result);
        }
    }
    static void BFS(LinkedList<Integer>[] stars, int N, int startPoint, int[] rank, boolean[] visited)
    {
        Queue<Integer> queue = new LinkedList<>(); 
        queue.add(startPoint);
        while(!queue.isEmpty())
        {
            int star = queue.remove();
            for(int num=0; num<stars[star].size(); num++)
            {
            	  int v = stars[star].get(num);
            	  if(!visited[v])
            	  {
            	       queue.add(v);
            	       rank[v] = rank[star]+1;
            	  }
            }
        
        }
    }
}