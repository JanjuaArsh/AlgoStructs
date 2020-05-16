import java.util.Scanner;

public class LuckyTime {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=0;tt<T;tt++)
		 {
			 String date = in.next();
			 int[] datech = new int[6];
			 datech[0] = date.charAt(0)-48;
			 datech[1] = date.charAt(1)-48;
			 datech[2] = date.charAt(3)-48;
			 datech[3] = date.charAt(4)-48;
			 datech[4] = date.charAt(6)-48;
			 datech[5] = date.charAt(7)-48;
			 int[] arr = new int[10];
			 if(date.equals("23:59:59"))
			 {
				 System.out.println("01:23:45");
			 }
			 else 
			 {
				 for(int i = 0; i<6;i++)
				 {
					 if(arr[datech[i]] != 1)
					 {
						 arr[datech[i]] = 1;
					 }
					 else if(arr[datech[i]] == 1)
					 {
						 while(arr[datech[i]] == 1)
						 {
							 datech[i] = (char) (datech[i] + 1);
							 if(arr[datech[i]] != 1)
							 {
								 arr[datech[i]] = 1; 
							 }
						 }
						
					 }
					 
				 }
			 }
			 System.out.println(datech[0] + datech[1] + ':' + datech[2] + datech[3] + ':'+ datech[4] + datech[5] );
		 }
	}

}
