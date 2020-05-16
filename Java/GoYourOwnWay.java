import java.util.Scanner;

public class GoYourOwnWay {

	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=1;tt<=T;tt++)
		 {
			 int N = in.nextInt();
			 String Path = in.next();
			 char[] pathres = new char[(2*N)-2];
			 int mex = 0,mey = 0,himx = 0,himy = 0;
			 System.out.print("Case #" + tt + ": ");
			 for(int i=0;i<(2*N)-2;i++)
			 {
				if(Path.charAt(i) == 'S')pathres[i] = 'E';
				else pathres[i] = 'S';
				System.out.print(pathres[i]);
					
			 }
			 System.out.println("");
		 }
	}
}
