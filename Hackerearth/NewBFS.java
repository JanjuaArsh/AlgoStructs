import java.util.*;

public class NewBFS
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=0;t<T;t++)
        {
            int N = in.nextInt();
            int[] stars = new int[N+1];
            int[] rank  = new int[N+1];
            for(int n=1;n<N;n++)
            {
                int a = in.nextInt();
                int b = in.nextInt();
                //a to b== parent of b is a
                stars[b] = a;
            }
            int startPoint = in.nextInt();
            stars[startPoint] = startPoint;
            rank[startPoint] = 1;
            fillranks(rank,stars,N);
            
            int result = 0;
            int max = 0;
            for(int i=N;i>0;i--)
            {
                if(rank[i]>=max)
                {
                    max = rank[i];
                    result = i;
                }
            }System.out.println(result);
        }
    }
    
    static void fillranks(int[] rank, int[] stars, int N)
    {
        for(int i=1;i<N+1;i++)
        {
            if(rank[i] == 0)
            {
                rank[i] = find(i,rank,stars);
            }
        }
    }
    static int find(int i,int[] rank, int[] stars)
    {
        if(rank[stars[i]] != 0)
        {
            rank[i] = rank[stars[i]]+1;
            return rank[i];
        }else
        {
        	rank[i] =  find(stars[i],rank,stars)+1; return rank[i];
        }
    }
}