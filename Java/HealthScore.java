import java.util.Scanner;

public class HealthScore {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int N = in.nextInt();
		 
		 long motion = 0;
		 long motioncurr = 0;
		 long beg = 0;
		 long curr = 0;
		 long count = 1;
		 long result = 1;
		 
		 long[] num = new long[N];
		 for(int i=0;i<N;i++)
		 {
			 num[i] = in.nextLong();	 
		 }
		 
		 for(int i=1;i<N;i++)
		 {
			 if(num[i] == num[i]-1 )   motioncurr = 0;
			 else if(num[i] > num[i-1] ) motioncurr = 1;
			 else  if(num[i] < num[i-1] )   motioncurr = 2;
			 
			 if(motion == motioncurr)
			 {
				 curr = i;
				 count++;
				 result = result+count;
			 }
			 else
			 {
				 count = 1; 
				 motion = motioncurr;
				 result = result+count;
				 beg = i;
				 curr = i;
			 }
		 }
		 System.out.println(result);
	}		 
		 

}
