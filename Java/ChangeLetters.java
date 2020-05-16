import java.util.Scanner;

public class ChangeLetters {
	 public static void main(String args[] ) throws Exception {
	        
	        Scanner in = new Scanner(System.in);
	        String inp = in.next();
	         char[] resch = new char[inp.length()];
	        int k = in.nextInt();
	        int left = k;
	        for(int i=0 ; i < inp.length(); i++)
	        {
	        	if(( 'z'-inp.charAt(i) + 1) <= left && inp.charAt(i) != 'a')
	        	{
	        		resch[i] = 'a';
	        		left = left - ( 'z'-inp.charAt(i) + 1);
	        	
	        	}
	        	else
	        	{
	        		resch[i] =  inp.charAt(i);
	        	}
	        }
	        if(left!=0)
	        {
	        	while(left > 26 )
	        	{
	        		left = left-26;
	        	}
	        	int size = resch.length-1;
	        	char last = (char) (resch[size] + left);
	        	resch[size] = last;
	        }
	        
	        for(int i=0 ; i < inp.length(); i++)
	        {
	        	 System.out.print(resch[i]);
	        }
	       
	 }

}
