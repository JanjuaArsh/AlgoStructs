import java.util.*;
  
public class algosadad{   
	
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int r = in.nextInt();
		
		double anglebetweenpointsatcenter = angleOfRadian(x1, x2, y1, y2);
		if(anglebetweenpointsatcenter>90)
		{
			//tangent solution
		}
		else
		{
			
		}
	}
	
	static int checkCollision(int a, int b, int c,  int x, int y, int radius) 
	{ 
	// Finding the distance of line from center. 
	double dist = (Math.abs(a * x + b * y + c)) /  
	     Math.sqrt(a * a + b * b); 
	
	// Checking if the distance is less than,  
	// greater than or equal to radius. 
	if (radius == dist) 
	{
		System.out.println ( "Touch" ); 
		return 1;
	}
	else if (radius > dist) 
	{
		System.out.println( "Intersect") ;
		return 2;
	}
	else
	{
		System.out.println( "Outside") ; 
		return 3;
	}
	} 
} 