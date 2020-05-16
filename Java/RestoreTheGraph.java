import java.io.IOException;
import java.util.Scanner;

public class RestoreTheGraph {
	 public static void main(String[] args) throws IOException {
    	 Scanner in = new Scanner(System.in);
    	 int T = in.nextInt();
    	 for(int t=0;t<T;t++)
    	 {
    		 int N = in.nextInt();
    		 int[][] dist = new int[N][N];
    		 int result = 1;
    		 for(int i=0;i<N;i++)
    		 {
    			 for(int j=0;j<N;j++)
        		 {
        			 dist[i][j] = in.nextInt();
        			 if(dist[i][j]<0)result = 0;
        			 else if(i == j)
        			 {
        				 if(dist[i][j]!=0)result=0; 
        			 }
        			 else if(i > j)
        			 {
        				 if(dist[i][j]!=dist[j][i])result=0; 
        			 }
        		 }
    		 }
    		 System.out.println(result);
    	 }
	 }
}
