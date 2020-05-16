import java.text.DecimalFormat;
import java.util.Scanner;

public class DieRoll {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=0;tt<T;tt++)
		 {
			 int n = in.nextInt();
			 int m = in.nextInt();
			 double count = 0.0000;
			 
			 if(m == 0)
			 {
				 count = (double)3*n;
			 }
			 else if(m == n)
			 {
				 count = 0.0000;
			 }
			 else
			 {
				 count = (double)n-m;
				 count = count + (double)(3*n);
			 }
			 DecimalFormat df = new DecimalFormat("0.00");
			 System.out.println(df.format(count));
				 
		 }
	}
}
