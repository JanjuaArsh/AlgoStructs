import java.util.Scanner;

public class NonAdjacentMaxSum
{
	public static void main(String args[] ) throws Exception 
	{
		 Scanner in = new Scanner(System.in);
		 int T = in.nextInt();
		 for(int tt=0;tt<T;tt++)
		 {
			int N = in.nextInt();
			
			int exnew = -1000;
			int excl = -1000;
			int incl = -1000;
			
			String inc = null;
			String exc = null;
			for(int i=0; i<N; i++)
			{
				int inp = in.nextInt();
				String excold = exc;
				exnew = (incl > excl)? incl: excl;
				if(exnew == incl && exnew != excl){
					exc = inc;
				}
				else if(incl == excl && inc != null && exc != null)
				{					 
						String[] splitinc = inc.split("\\s+");
						String[] splitexc = exc.split("\\s+");
						exc = (Integer.parseInt(splitinc[splitinc.length-1]) > Integer.parseInt(splitexc[splitexc.length-1]))? inc: exc;
				}
				
				if(inp<0)
				{ if(inp > incl)
					inc =  Integer.toString(inp);
					incl =  inp;
				}else
				{
					if(excl >= 0)
					{
						incl = excl + inp;
						inc = excold + ' ' +Integer.toString(inp);
					}
					else if(excl < 0)
					{
						incl =  inp;
						inc = Integer.toString(inp);
					}
				}
					excl = exnew;
			}
				
				if(incl>excl)
				{
					String[] splited = inc.split("\\s+");
					for(int s = splited.length; s>0;s--)
					{
						System.out.print(splited[s-1]);
					}System.out.println();
				}
				else if(incl<excl)
				{
					String[] splited = exc.split("\\s+");
					for(int s = splited.length; s>0;s--)
					{
						System.out.print(splited[s-1]);
					}
					System.out.println();
				}
				else if(incl==excl)
				{
					String[] splitinc = inc.split("\\s+");
					String[] splitexc = exc.split("\\s+");
					int minlength = Math.min(splitinc.length, splitexc.length);
					int whichone = 0;
					for(int i=minlength-1; i>=0; i--)
					{
						int a = Integer.parseInt(splitinc[i]);
						int b = Integer.parseInt(splitexc[i]);
						if(a>b) 
						{
							whichone = 1; break;
						}
						if(b>a)
						{
							whichone = 2; break;
						}
					}
					
					if(whichone == 2)
					{
						for(int s = splitexc.length; s>0;s--)
						{
							System.out.print(splitexc[s-1]);
						}
						System.out.println();

					}
					else
					{
						for(int s = splitinc.length; s>0;s--)
						{
							System.out.print(splitinc[s-1]);
						}
						System.out.println();
					}
				}
			
		 }
		 in.close();
	}
}
