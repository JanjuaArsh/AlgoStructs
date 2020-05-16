import java.util.Scanner;

public class RestarauntOrder {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 String s = in.next();
		 int[] empskills = new int[7];
		 long result = 0;
		 for(int i=0; i<s.length();i++)
		 {
			 char ch = s.charAt(i);
			 if(ch == 'V')
			 {
				 empskills[0]++; 
			 }
			 else if(ch == 'N')
			 {
				 empskills[1]++; 
			 }
			 else if(ch == 'G')
			 {
				 empskills[2]++; 
			 }
			 else if(ch == 'T')
			 {
				 empskills[3]++; 
			 }
			 else if(ch == 'S')
			 {
				 empskills[4]++; 
			 }
			 else if(ch == 'B')
			 {
				 empskills[5]++; 
			 }
			 else if(ch == 'P')
			 {
				 empskills[6]++; 
			 }
		 }
		 int m = in.nextInt();
		 int[][] orders = new int[m][3];
		 for(int i=0; i<m;i++)
		 {
			String inp = in.next();
			
			if(inp.charAt(0) == 'V')
			{
				orders[i][0] = 0;
			}
			else if(inp.charAt(0) == 'N')
			{
				orders[i][0] = 1;
			}
			
			if(inp.charAt(1) == 'G')
			{
				orders[i][1] = 2;
			}
			else if(inp.charAt(1) == 'T')
			{
				orders[i][1] = 3;
			}
			
			if(inp.charAt(2) == 'S')
			{
				orders[i][2] = 4;
			}
			else if(inp.charAt(2) == 'B')
			{
				orders[i][2] = 5;
			}
			else if(inp.charAt(2) == 'P')
			{
				orders[i][2] = 6;
			}
			
			result = 0;
			if(empskills[orders[i][0]] != 0 && empskills[orders[i][1]]!= 0 && empskills[orders[i][2]] != 0)
			{
				result = empskills[orders[i][0]] % 1000000007;
				empskills[orders[i][0]]--;
				
				result = (empskills[orders[i][1]]% 1000000007)  * result;
				empskills[orders[i][1]]--;
				result = (empskills[orders[i][2]] % 1000000007)  * result;
				empskills[orders[i][2]]--;

				result = result  % 1000000007;
			}
			
			System.out.println(result);
		 }
	}

}
