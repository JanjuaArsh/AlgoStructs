import java.util.Scanner;

public class ForeGoneSolution {

	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=1;tt<=T;tt++)
		 {
			 
			int N = in.nextInt();
			int temp = N;
			int length = (int) (Math.log10(N) + 1);
			int[] narr = new int[length];
			int[] res1 = new int[length];
			int[] res2 = new int[length];
			
			 for(int i=0;i<length;i++)
			 {
				 narr[i] = temp%10;
				 temp=temp/10;
				 
				 if(narr[i] == 4)
				 {
					 res1[i] = 3;
					 res2[i] = 1;
				 }
				 else
				 {
					 res1[i] = narr[i];
					 res2[i] = 0;
				 }
			 }
			 System.out.print("Case #" + tt + ": ");
			 for(int i=length-1;i>=0;i--)
			 {
				 System.out.print(res1[i]); 
			 }
			 System.out.print(" ");
			 int print = 0;
			 for(int i=length-1;i>=0;i--)
			 {
				 if(print == 0)
				 {
					 if(res2[i]>0) print =1; 
				 }
				 if(print == 1)
				 System.out.print(res2[i]); 
			 }
			 System.out.println("");
		 }
	}
}
