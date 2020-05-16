import java.util.Scanner;

public class CubeProblem {
	 public static void main(String args[] ) throws Exception {
	        
	        Scanner in = new Scanner(System.in);
	        int T = in.nextInt();
	        for(int x =1; x<=T; x++)
	        {
	        	long result = 0;
	        	int N = in.nextInt();
	        	int mid = (N+1)/2;
	        	
	        	long a = 1;
	        	long d = 4;
	        	result = 0;
	        	int num = 0;
	        	for(int count = 0 ; count<mid ; count++)
	        	{
	        		if(count != mid)
	        		result = result + ((a + (num* d))  * 2);
	        		else
	        			result = result + (a + (num* d));
	        		
	        		if(count == 0)num++;
	        		else if(count == 1) num = 3;
	        		else
	        			num = num + count+1 ;
	        			
	        			
	        	}
	        	result = result % (7000000000l);
	        	System.out.println(result);
	        }
	        
	 }
}
