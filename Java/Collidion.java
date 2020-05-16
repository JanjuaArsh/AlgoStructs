import java.util.Scanner;

public class Collidion {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=0;tt<T;tt++)
		 {
			 int n = in.nextInt();
			 int[] arr = new int[10];
			 int collisions = 0;
			 for(int i =1;i<=n;i++)
			 {
				 int number = in.nextInt();
				 number = number%10;
				 
				 if(arr[number] == 1)collisions++;
				 else
					 arr[number] = 1;
			 }
			 
			 System.out.println(collisions);
		 }
	}

}
