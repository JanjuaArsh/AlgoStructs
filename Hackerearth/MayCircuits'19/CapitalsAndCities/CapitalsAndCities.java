import java.util.*;
  
public class CapitalsAndCities{   
	
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		Coordinates[] arr = new Coordinates[N];
		long[] sumarr = new long[N];
		for(int t=1;t<=N;t++)
		{
			Coordinates obj = new Coordinates();
			obj.coordinate = in.nextInt();
			obj.index = t;
			arr[t-1] = obj;
			
		}
		
		Arrays.sort(arr, new SortbyCoordinate()); //nlogn
		//find sum for each coordinate as starting point
		long sum = 0;
		int multplicativenum = N-1;
		for(int i = 1;i<N; i++)
		{
			sum = sum + ((long)Math.abs(arr[i-1].coordinate - arr[i].coordinate)* (long)multplicativenum);
			multplicativenum--;
		}
		
		sumarr[0] = sum;
		
		 multplicativenum = N-1;
		 int inversemulnum = 1;
		for(int i = 1;i<N; i++)
		{
			sum = sum - ((long)Math.abs(arr[i-1].coordinate - arr[i].coordinate)* (long)multplicativenum) +((long)Math.abs(arr[i-1].coordinate - arr[i].coordinate)* (long)inversemulnum);
			multplicativenum--;
			inversemulnum++;
			sumarr[i] = sum;
		}
		long result = Long.MAX_VALUE;
		int index = 0;
		for(int i = 0;i<N; i++)
		{
			long tempsum = sumarr[i];
			if(tempsum >= K)tempsum = tempsum-K;
			else if(tempsum < K) tempsum = (K-tempsum)%2;
			
			if(result > tempsum)
			{
				result = tempsum;
				index = arr[i].index;
			}
			else if(result == tempsum && index > arr[i].index)
			{
				result = tempsum;
				index = arr[i].index;
			}
		}
		
		System.out.println(index + " " + result);
	}
} 
 
class Coordinates
{
	int coordinate;
	int index;
}
 
class SortbyCoordinate implements Comparator<Coordinates> 
{ 
    public int compare(Coordinates a, Coordinates b) 
    { 
        return a.coordinate - b.coordinate; 
    } 
} 
