import java.io.IOException;
import java.util.Scanner;

public class FractionSeries {
	
	 public static void main(String[] args) throws IOException {
		 Scanner in = new Scanner(System.in);
		 	int N = in.nextInt();
			int M= in.nextInt();
			int X = in.nextInt();
			int Y= in.nextInt();
			int [] nodelist = new int[N*M];
			int size = 0;
			for(int i=0; i<N+1; i++)
			{
					if(i == 0)
					{
						String inp = in.nextLine();
					}
					else
					{
						String inp = in.nextLine();
						for(int j=1; j<inp.length()-1; j=j+4)
						{
							if(inp.charAt(j) == '_')
							{
								
							}
							else if(inp.charAt(j) == '|')
							{
								grid[i][index].right = 0;
								if(i+1 <= M)
								grid[i][index+1].left = 0;
							}
							index++;
						}
					}
			}
			
			int k = in.nextInt();
			int size = 0;
			for(int i=0;i<k;i++)
			{
				int x = in.nextInt();
				int y = in.nextInt();
				grid[x][y].data = 0;
				grid[x][y].visited = 0;
				stackx = new int[N*M];
				stacky = new int[N*M];
				if(grid[x][y].up == 1)
				{
					if(grid[x-1][y].visited != i)
						push(x-1,y);
				}
				 if(grid[x][y].down == 1)
				{
					 if(grid[x+1][y].visited != i)
				 		push(x+1,y);
				}
				 if(grid[x][y].right == 1)
				{
					 if(grid[x][y+1].visited != i)
					 		push(x,y+1);

				}
				 if(grid[x][y].left == 1)
				{
					 if(grid[x][y-1].visited != i)
					 		push(x,y-1);

				}
			}
	 }
}
