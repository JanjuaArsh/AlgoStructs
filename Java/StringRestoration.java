import java.io.IOException;
import java.util.Scanner;

public class StringRestoration {
	 public static void main(String[] args) throws IOException {
    	 Scanner in = new Scanner(System.in);
    	 int T = in.nextInt();
    	 String[] rsult = new String[T];
    	 int letter = 97;
    	 for(int t = 0; t<T; t++)
    	 {
    		 int plength = in.nextInt();
    		 int[] parr = new int[plength];
    		 String str = "";
    		 for(int p = 0; p<plength; p++)
        	 {
    			 parr[p] = in.nextInt();
        	 }
    		 
    		 if(parr[0] != 1)
    		 {
    			 rsult[t] = "-1";
    		 }
    		 else if(parr[0] == 1)
    		 {
    			 str = str+ (char)letter;
    			 for(int i=1; i<plength; i++)
    			 {
    				 if( parr[i] < parr[i -1 ])
    				 {
    					 str = "-1";
    					 break;
    				 }
    				 else if( parr[i] == parr[i -1 ])
    				 {
    					 str = str+ (char)letter;
    				 }
    				 else if( parr[i] == parr[i -1 ] + 1)
    				 {
    					 letter++;
    					 str = str+ (char)letter;
    				 }
    				 else if(parr[i] > parr[i -1 ] + 1)
    				 {
    					 str = "-1";
    					 break;
        			 }
    			 }
    			 
    			 rsult[t] = str;
    			 
    		 }
    	 }
    	 for(int i = 0; i<rsult.length; i++)
    	 {
    		 System.out.println(rsult[i]);
    	 }
    	
	 }
}
