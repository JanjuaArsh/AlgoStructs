import java.io.*;
import java.util.*;


public class MaximumDepth {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
       int T = in.nextInt();
	    for(int t_i=0; t_i<T; t_i++)
	    {
	      int N = in.nextInt();
	      int[] matchesa = new int[26];
	      String teamA = in.next();
	      String teamB = in.next();
	      for(int i=0; i<N; i++)
	      {
	    	  int a = teamA.charAt(i) - 97;
	    	  matchesa[a]++;
	      }
	      int result = 0;
	      for(int i=0; i<N; i++)
	      {
	    	  int b = teamB.charAt(i) - 97;
	    	  if(matchesa[b] != 0)
	    	  {
	    		  matchesa[b]--;
	    		  result++;
	    	  }
	      }
	      System.out.println(result);
	    }
	
	    in.close();
    }
    
}