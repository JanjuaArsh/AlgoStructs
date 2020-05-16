import java.io.IOException;
import java.util.*;

public class GoodSubsequence {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		int N = in.nextInt();
		int[] seq = new int[N];


		for(int i = 0; i<N ; i++)
		{
			seq[i] = in.nextInt();
		}   	 
    	 long result = 1;
    	 int[] arr = new int[10]; 
    	 for(int i = 0; i<S.length() ; i++)
 		{
    		 int digit = S.charAt(i) - 48;
    		 arr[digit]++;
 		}
    	 for(int i = 0; i<N ; i++)
 		{
    		 result = result * arr[seq[i]];
 		}
    	 System.out.println(result);
	}
}
