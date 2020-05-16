import java.util.Scanner;
import java.lang.Math; 

public class CounterStrikePro {
	 public static void main(String args[] ) throws Exception {
	        
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int tt =0; tt<t; tt++)
	        {
	        	int N = in.nextInt();
	        	int M = in.nextInt();
	        	int D = in.nextInt();
	        	
	        	int requiredcount = M/2;
	        	
	        	int[][] locations = new int[N][2];
	        	int[][] targets = new int[M][2];
	        	for(int l = 0; l<N; l++)
		        {
	        		locations[l][0] = in.nextInt();
	        		locations[l][1] = in.nextInt();
		        }
	        	for(int l = 0; l<M; l++)
		        {
	        		targets[l][0] = in.nextInt();
	        		targets[l][1] = in.nextInt();
		        }
	        	int count = 0;
	        	for(int l = 0; l<N; l++)
		        {
	        		for(int ll = 0; ll<M; ll++)
			        {
		        		double distanceD = Math.sqrt((locations[l][0] - targets[ll][0])*(locations[l][0] - targets[ll][0]) + (locations[l][1] - targets[ll][1])*(locations[l][1] - targets[ll][1]));
		        		int distance = (int)distanceD;
		        		
		        		if(distance <= D)count++;
		        		
		        		if(count >= requiredcount)
		        		{
		        			break;
		        		}
			        }
		        }
	        	if(count >= requiredcount)
        		{
        			System.out.println("YES");
        		}
	        	else
	        	{
	        		System.out.println("NO");
	        	}
	        	
	        }
	 }

}
