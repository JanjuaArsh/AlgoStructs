import java.util.*;

class FindOut {
    public static void main(String args[] ) throws Exception {
        
        Scanner in = new Scanner(System.in);
       int T = in.nextInt();
       for(int i=1; i<=T;i++)
       {
    	   int count = 0;
    	   int num = in.nextInt();
    	   for(int n = 1; n<=num; n++ )
    	   {
    		   if(n==1)
    		   {
    			   count = count + (num * num); 
    		   }
    		   else
    		   {
    			   count = count + ((num -1) *2) +1;
    		   }
    	   }
    	   System.out.println(count);
       }

    }
}
