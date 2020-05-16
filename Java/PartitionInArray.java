import java.io.IOException;
import java.util.Scanner;

public class PartitionInArray {
	 public static void main(String[] args) throws IOException 
	 {
    	 Scanner in = new Scanner(System.in);
    	 int N = in.nextInt();
    	 long[] arr = new long[N];
    	 for(int i=0; i<N; i++)
    	 {
    		 long inp = in.nextLong();
    		 arr[i] = inp;
    	 }
    	 double diff = 0;
    	 long index = 0;
    	 double min = 100000000000000000d;
    	 for(int i=0; i<N; i++)
    	 {
    		diff = (1.0/arr[i]) - diff;
    		if(diff<0)diff = diff*-1;
    		if(min >diff)
    		{
    			min = diff;
    			index = i;
    		}
    	 }
    	 index++;
    	 System.out.println(index);
	 }
}
