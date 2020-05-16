import java.util.Scanner;

public class StringConvert {

	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 String s = in.next();
		 char[] ch = new char[s.length()];
		 for(int i=0; i<s.length();i++)
		 {
			 int f = (int)s.charAt(i);
			
			 if(f >= 65 && f<= 91)//caps
			 {
				 ch[i] = (char) ((int)f + 26 + 6); 
			 }
			 else
			 {
				 ch[i] = (char) ((int)f - 26 - 6);
			 }
			 System.out.print(ch[i]);
		 }
	}
}
