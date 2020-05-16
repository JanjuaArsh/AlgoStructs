import java.util.*;

public class SubsetSumProblem
{
	//static boolean[][] dp;
	//static int[][] count;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		/*int T = in.nextInt();	
		for(int t = 0; t < T; t++)
		{*/
			int N = in.nextInt();
			int sumproteins = in.nextInt();
			int[] proteins = new int[N];
			//int[] fats = new int[N];
			//int[] carbs = new int[N];
			for(int n=0;n<N;n++)
			{
				proteins[n] = in.nextInt();
				//fats[n] = in.nextInt();
				//carbs[n] = in.nextInt();
			}
			/*for(int i=0;i<3;i++)
			{*/
				/*int sumproteins = in.nextInt();*/
				//int sumfats = in.nextInt();
				//int sumcarbs = in.nextInt();
				call(sumproteins,proteins,N);
				//FindSubSets(sumproteins,proteins,N);
				/*for(int ii=0;ii<=N;ii++)
				{
					for(int j=0;j<=sumproteins;j++)
					{
						System.out.print(count[ii][j]+ " ");
					}
					System.out.println();
				}*/
				
		/*	}*/
	/*	}*/	
		in.close();
	}
	static void call(int sumproteins,int[] proteins, int n)
	{
	    	 List<List<Integer>> s = new LinkedList<List<Integer>>();
		 	 List<Integer> v = new LinkedList<Integer>();
	     solve(proteins,0,n,sumproteins,s,new LinkedList<Integer>(v));
	    Iterator it = s.iterator(); 
	  while(it.hasNext())
	    {
	    	LinkedList<Integer> yus = (LinkedList<Integer>) it.next();
	    	for(int i = 0; i < yus.size(); i++){
	            System.out.print(yus.get(i));
	        }System.out.println();	
	    } 
	}
	
	static void solve(int[] proteins, int i, int n, int sumproteins, List<List<Integer>> se, List<Integer> v)
	{
		 if(sumproteins==0){
			 //v.sort(c);
			 int size = se.size();
			 se.add(size, new LinkedList<Integer>(v));
			 /*for(int ii = 0; ii < v.size(); ii++){
		            System.out.print(v.get(ii));
		       
		        }System.out.println();	*/
		    }
		 if(sumproteins<0){
			 return;
		    }
		    if(i==n){
		        return ;
		    }
		    solve(proteins,i+1,n,sumproteins,se,new LinkedList<Integer>(v));
		   /* for(int ii = 0; ii < v.size(); ii++){
	            System.out.print(v.get(ii));
	        }System.out.println();	
	    */
		    v.add(proteins[i]);
		    solve(proteins,i+1,n,sumproteins-proteins[i],se,new LinkedList<Integer>(v));
		    /*for(int ii = 0; ii < v.size(); ii++){
	            System.out.print(v.get(ii));
	        }System.out.println();	*/
	   
	}
	/*static void FindSubSets(int sumproteins,int[] proteins, int n)
	{
		dp = new boolean[n+1][sumproteins+1];
		count = new int[n+1][sumproteins+1];
		for(int i=0;i<=n;i++)//you can always make a sum of zero
		{
			dp[i][0] = true;
			count[i][0] = 0;
		}
		for(int i=1;i<=sumproteins;i++)//you can not make any number with no element
		{
			dp[0][i] = false;
			count[0][i] = -1;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sumproteins;j++)
			{
				if(j - proteins[i-1] >= 0)
				{
					dp[i][j] = (dp[i-1][j])? dp[i-1][j] :  dp[i-1][j - proteins[i-1]];//-1 added bacause proteins array is 0 indexed
				}	
				else
				{
					dp[i][j] = dp[i-1][j];
				}
				if(dp[i][j])
				{ 
					if(j - proteins[i-1] >= 0)
					{
						if(count[i-1][j] == -1)
						{
							count[i][j] = count[i-1][j - proteins[i-1]] + 1;
						}
						else if(count[i-1][j - proteins[i-1]] == -1)
						{
							count[i][j] = count[i-1][j];
						}
						else 
							count[i][j] = (count[i-1][j] < count[i-1][j - proteins[i-1]] + 1)?count[i-1][j]: count[i-1][j - proteins[i-1]] + 1;
					}
				  else
					  count[i][j] = count[i-1][j];
				}else count[i][j] = -1;
				
			}
		}
		
	}*/
}
