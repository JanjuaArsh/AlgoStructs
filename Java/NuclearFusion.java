import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class IntPair {
    final int x;
    final int y;
    IntPair(int x, int y) {this.x=x;this.y=y;}
  
  }

class NuclearFusionResult {

    /*
     * Complete the 'nuclearFusion' function below.
     *
     * The function accepts INTEGER_ARRAY elements as parameter.
     */

    public static void nuclearFusion(List<Integer> elements) 
    {
    	int N =10;
    	LinkedList<Integer> ec = new LinkedList<Integer>();
    	ed[] aad = new ed[N];
    	
    	 ArrayList<Integer> listA = new ArrayList<Integer>();
         ArrayList<IntPair> listB = new ArrayList<IntPair>();
    	
    	int n = elements.size();
    	int[] heights = new int[n+2];//contains depth of each element
        int[] parent = new int[n+2];
        int index = 2;
        int maxheight = 1;//max height of the tree
        heights[1] = 1;
        for(int element: elements )//10^5
        {
            parent[index] = element;
            heights[index] = heights[element] + 1;
            if(heights[index]>maxheight)
            {
                maxheight=heights[index];
            }
            index++;
        }
        
        for(int time = 1; time<=maxheight; time++)
        {
        	for(int depth = 1; depth<=maxheight; depth++)
        	{
        		ArrayList<Integer> requiredNodes = new ArrayList<Integer>();
        		//find all nodes with depth
        		for(int i=1; 1<=maxheight;i++)
        		{
        			if( heights[i] == depth)
        			{
        				if(!requiredNodes.isEmpty())
        				{
        					
        				}
        				requiredNodes.add(i);
        			}
        			
        		}
        		
        		//among these nodes find if they are time siblings
        		for(int requiredNode : requiredNodes)
        		{
        			
        		}
        		
        	}
        }
    }

}

public class NuclearFusion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> elements = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        NuclearFusionResult.nuclearFusion(elements);

        bufferedReader.close();
    }
}
