import java.util.Scanner;

public class FriendsAndFoes {
	static int[] parent;
	static int[] rank;
	static int[] size;
	
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int N = in.nextInt();
		 parent = new int[N+1];
		 rank = new int[N+1];
		 size = new int[N+1];
		 int M1 = in.nextInt();
		 for(int i = 1; i <= N; i++)
		 {
			 makeset(i); 
		 }
		 for(int i = 1; i <= M1; i++)
		 {
			 int A = in.nextInt();
			 int B = in.nextInt();			 
			 union(A,B);
		 }
		System.out.println();
		
		 int M2 = in.nextInt();
		 for(int i = 1; i <= M2; i++)
		 {
			 int A = in.nextInt();
			 int B = in.nextInt();
			 
			 int aid = find(A);
			 int bid = find(B);
			 
			 if(aid == bid && aid != 0)
			 parent[aid] = 0;
		 }
		 int maxSize = 0;
		 for(int i = 1; i <= N; i++)
		 {
			 if(parent[i] == i)
			 {
				 if(size[i] > maxSize)maxSize = size[i];
			 }
			 
		 }
		 System.out.println(maxSize);
	}
	
	public static void makeset(int i)
	{
		parent[i] = i;
		rank[i] = 0;
		size[i] = 1;
	}
	
	public static int find(int i)
	{
		while(i != parent[i])
		{
			i = parent[i];
		}
		return i;
	}
	
	public static void union(int i, int j)
	{
		int I = find(i);
		int J = find(j);
		
		if(I == J) return; //they are already in same set
		
		if(rank[I] > rank[J])
		{
			parent[J] = I;//keeping tree shallow
			size[I] += size[J];
		}
		else
		{
			size[J]+= size[I];
			parent[I] = J;
		}
		
		if(rank[I] == rank[J]) rank[J] = rank[J] + 1;
	}
}
