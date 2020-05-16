import java.util.Scanner;

public class ProbabilityRandomNum {
	public static void main(String args[] ) throws Exception {
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        if(c>= a+b)System.out.println('1');
        else if( c < Math.min(a, b))
        {
        	System.out.println("1/4");
        }
        else if( c < Math.max(a, b))
        {
        	System.out.println("1/2");
        }
        else
        {
        	System.out.println("0");
        }
	}

}
