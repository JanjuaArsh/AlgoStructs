import java.util.Scanner;

public class DirectoryDeletion {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int N = in.nextInt();
		 int[] parents = new int[N+1];
		 for(int i=1;i<=N;i++)
		 {
			 parents[i] = in.nextInt();
		 }
		 int M = in.nextInt();
		 int[] deleted = new int[N+1];
		 for(int i=0;i<M;i++)
		 {
			 int inp = in.nextInt();
			 deleted[inp] = 1;
		 }
		 int count = 0;
		 for(int i=1;i<=N;i++)
		 {
			 if(deleted[i] == 1)
			 {
				 //find top node -- if top node aint one means it has already been deleated.
				 count = DeleteAllNode(i,parents, deleted, count);
			 }
		 }
		 System.out.println(count);
	}
	
	static int DeleteAllNode(int node, int[] parent, int[] deleted, int count)
	{
		
		deleted[node] = 2;
		int dod = deleteparents(parent[node], parent, deleted);
		if(dod == 1)count++;
		parent[node] = -2;
		return count;
	}
	static int deleteparents(int node, int[] parent, int[] deleted)
	{
		if(node == -1)return 1;
		if(node == -2)return 0;
		else if(deleted[node] == 1)//yes delete
		{
			deleted[node] = 2;
			node = parent[node];
			parent[node] = -2;
		}
		
			int res = deleteparents(node, parent, deleted);
		
		
		return res;
	}
}
