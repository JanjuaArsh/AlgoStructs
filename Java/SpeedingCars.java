import java.util.Scanner;

public class SpeedingCars {
	public static void main(String args[] ) throws Exception {
	 Scanner in = new Scanner(System.in);
	 int T = in.nextInt();
	 for(int tt=0;tt<T;tt++)
	 {
		 int N = in.nextInt();
		 
		 int currentmovingspeed = in.nextInt();
		 int result = 1;//one are in
		 for(int i=1;i<N;i++)
		 {
			 int speed = in.nextInt();
			 
			 if(speed <= currentmovingspeed)
			 {
				 result++;
				 currentmovingspeed = speed;
			 }
		 }
		 System.out.println(result);
		 
	 }
	}

}
