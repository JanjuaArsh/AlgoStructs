import java.math.BigInteger;
import java.util.Scanner;

public class Karraytree {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=0;tt<T;tt++)
		 {
			 int k = in.nextInt();//branches
			 int n = in.nextInt();	//level		
			 long count = 0;
			 BigInteger numberofnodes=new BigInteger(String.valueOf(k));
			 if(k-1 != 0)
			 {
				  numberofnodes =  ((long)Math.pow(k, n+1) -1 )/(k-1);
			 }
			
			 while(numberofnodes!=0)
			 {
				 count = (numberofnodes%10l) + count;
				 numberofnodes = numberofnodes/10;
			 }
			 System.out.println(count);
		 }
	}
}
