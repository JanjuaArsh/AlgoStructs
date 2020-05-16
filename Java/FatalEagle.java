import java.util.Scanner;

public class FatalEagle {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=0;tt<T;tt++)
		 {
			 long result = 0;
			 int N = in.nextInt();
			 int K = in.nextInt();
			 
			 if(N<K)
			 {
				 System.out.println(0);
				 break;
			 }
			 else if(N==K)
			 {
				 System.out.println(N);
				 break;
			 }
			 else
			 {
				 for(int i = K; i<=N;i++)
				 {
					 T(N, K);
					 
				 }
				 System.out.println(result);
			 }
		 }
	}
	static int T(int n, int k)
	{
		if(n==0)return 1;
		else if(n != 0 && n< k) 
		{
			return T(n-k, k) + T(n, k + 1);
		}
		return 0;
	
	}
}
