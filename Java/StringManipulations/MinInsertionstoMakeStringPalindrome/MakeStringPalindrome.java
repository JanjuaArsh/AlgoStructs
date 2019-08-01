import java.util.*;

public class MakeStringPalindrome {
	public static void main(String args[] ) throws Exception {

		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		String str = in.next();
		
		int result = getMinInsertion(str, length);
		System.out.println(result);
   }

	private static int getMinInsertion(String str, int length) {
		int[][] table = new int[length][length];
		int l, h, rank;
		
		for(rank = 1; rank < length; rank++)
		{
			for(h = rank, l = 0; h < length; l++,h++)
			{
				table[l][h] = (str.charAt(l) == str.charAt(h)) ? table[l+1][h-1] : Math.min(table[l][h-1], table[l+1][h]) +1;
			}
		}
		return table[0][length-1];
	}
}
