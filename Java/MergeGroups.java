import java.io.IOException;
import java.util.Scanner;

public class MergeGroups {
	 public static void main(String[] args) throws IOException {
    	 Scanner in = new Scanner(System.in);
    	 int N = in.nextInt();
    	 
    	 int[] parent = new int[1000000];
    	 int[] rank = new int[1000000];
    	 for(int i=0;i<N; i++)
    	 {
    		 int input = in.nextInt();
    		 parent[input] = input;
    		 rank[input] = 0;
    	 }
    	 
    	 int Q = in.nextInt();
    	 for(int i=0;i<Q; i++)
    	 {
    		 int type = in.nextInt();
    		 if(type == 1)
    		 {
    			 int x = in.nextInt();
    			 int y = in.nextInt();
    			 union(x,y, parent, rank);
    		 }
    		 else if(type == 2)
    		 {
    			 int x = in.nextInt();
    			 
    		 }
    	 }
    	 
    	 
	 }
	 
	 public static int find(int i, int[] parent)
	 {
		 while(i != parent[i])
		 {
			 i = parent[i];
		 }
		 return i;
	 }
	 public static void union(int i, int j , int[] parent, int[] rank)
	 {
		 int iid = find(i, parent);
		 int jid = find(j, parent);
		 
		 if(iid == jid) return;
		 
		 if(rank[iid] > rank[jid])
		 {
			 parent[jid] = iid;
		 }
		 else
		 {
			 parent[iid] = jid;
		 }
		 
		 if(rank[iid] == rank[jid])
		 {
			 rank[jid] = rank[jid]+1;
		 }
	 }
	 
}
