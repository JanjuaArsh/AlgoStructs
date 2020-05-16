import java.util.Scanner;

public class Roundlongs {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int N = in.nextInt();
		 int Q = in.nextInt();
		 long[] rounds = new long[N];
		 for(int i=0;i<N;i++)
		 {
			 long inp = in.nextLong();
			 if(inp<0)
			 {
				 rounds[i] = -1;
			 }
			 else if(inp == 0)
			 {
				 rounds[i] = 0; 
			 }
			 else
			 {
				 int tens = (int) (inp%10l); 
				 long temp = inp;
				 while(temp >= 10)
				    {
					 	temp = temp / 10;
				    }
				 int first = (int) temp;
				 
				 if(tens == first)
				 {
					 rounds[i] = 1;  
				 }
				 else
				 {
					 rounds[i] = -1;
				 }
			 }
		 }
		 for(int i=0;i<Q;i++)
		 {
			 int A = in.nextInt();
			 int B = in.nextInt();
			 
			 if(A == 1)//print range
			 {
				 int C = in.nextInt();
				 int count=0;
				 for(int j=B-1; j<=C-1; j++)
				 {
					 if(rounds[j] != -1)
					 {
						 count++;
					 }
				 }
				 System.out.println(count);
			 }
			 else if(A==2)//update
			 {
				 long inp = in.nextLong();
				 if(inp<0)
				 {
					 rounds[B-1] = -1;
				 }
				 else if(inp == 0)
				 {
					 rounds[B-1] = 0; 
				 }
				 else
				 {
					 int tens = (int) (inp%10l); 
					 long temp = inp;
					 while(temp >= 10)
					    {
						 	temp = temp / 10;
					    }
					 int first = (int) temp;
					 
					 if(tens == first)
					 {
						 rounds[B-1] = 1;  
					 }
					 else
					 {
						 rounds[B-1] = -1;
					 }
				 }
				 
			 }
		 }
	}

}
