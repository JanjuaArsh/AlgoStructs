import java.math.BigInteger;
import java.util.Scanner;

public class Tekken {
	
	static long findGCD(long a, long b, long c) 
    { 
        long result = a; 
        result = gcd(a, result); 
        result = gcd(b, result); 
        result = gcd(c, result); 
  
        return result; 
    } 
	
    static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
  
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=0;tt<T;tt++)
		 {
			long a = in.nextInt(); 
			long b = in.nextInt();
			long c = in.nextInt(); 
			long gcd = findGCD(a,b,c);
			if(gcd == 1)
			{
				if(c>a && c>b)
				{
					a = a*a;
					b= b*b;
					c=c*c;
					
					if(c == a+ b)System.out.println("YES");
					else System.out.println("NO");
				}
				else if(b>a && b>c)
				{
					a = a*a;
					b= b*b;
					c=c*c;
					
					if(b == c+ a)System.out.println("YES");
					else System.out.println("NO");
				}
				else if(a>c && a>b)
				{
					a = a*a;
					b= b*b;
					c=c*c;
					if(a == c+ b)System.out.println("YES");
					else System.out.println("NO");
				}
				
				else
				{
					System.out.println("NO");
				}
				
			}
			else
			{
				System.out.println("NO");
			}
			
		 }
	}
}
