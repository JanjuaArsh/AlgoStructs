import java.util.Scanner;

public class checkers {
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 int m = in.nextInt();
		 long matches = 0;
		//calculate the powers required to calculate hash values
		 long[] power = new long[32];
    	 power[0] = 1;
    	 for(int counter = 1; counter<32; counter++)
    	 {
    		 power[counter] = power[counter-1] * 31;
    	 }
		 //find required hash
    	 
    	 long[] hasheachrow = new long[32];
    	 
    	 String white = "_#_#_#_#_#_#_#_#_#_#_#_#_#_#_#_#";
    	 String black = "#_#_#_#_#_#_#_#_#_#_#_#_#_#_#_#_";
		 for(int counter = 0; counter<32; counter++)
		 {
			 if(counter%2 == 0)//white row
			 {
				 for(int i =0; i<32;i++)
				 {
					 hasheachrow[counter]  =  (((white.charAt(i)- 'a'+ 1)*power[i]) + hasheachrow[counter]); 
				 }
			 }
			 else//black row
			 {
				 for(int i =0; i<32;i++)
				 {
					 hasheachrow[counter]  =  (((black.charAt(i)- 'a'+ 1)*power[i]) + hasheachrow[counter]); 
				 }
			 }
			
		 }
		 
		 String[] rows = new String[n];
		 //compare hashes with the given data
		 long inputHash = 0;
		 for(int counter = 0; counter<n; counter++)
		 {
			 rows[counter] = in.nextLine();
		 }
		 if(n<32)
		 {
			 System.out.println('0');
		 }
		 else if(m<32)
		 {
			 System.out.println('0'); 
		 }
		 else
		 {
			 for(int counter = 0; counter<n-32; counter++)
			 {
				 for(int inner = 0; inner<m-32; inner++)
				 {
					 int rowmatch = 0;
					//calculate has 32*32 
					 for(int find = 0; find<32; find++)
					 {
						 if(find%2 == 0)//white row
						 {
							 for(int i =0; i<32;i++)
							 {
								 inputHash  =  (((rows[inner].charAt(i)- 'a'+ 1)*power[i]) + inputHash); 
							 }
						 }
						 else//black row
						 {
							 for(int i =0; i<32;i++)
							 {
								 inputHash  =  (((rows[inner].charAt(i)- 'a'+ 1)*power[i]) + inputHash); 
							 }
						 }
						 if(inputHash == hasheachrow[find])
						 {
							 rowmatch++;
						 }
						
					 }
					 if(rowmatch == 32)
					 {
						 matches++;
					 }
				 }
			 }
			 System.out.println(matches);
		 }
		 
			  	 
	}

}
