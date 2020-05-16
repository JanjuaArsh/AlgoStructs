 import java.io.*;
 import java.util.*;

 public class  KickStart  {
	 
	 public static void main(String[] args) throws IOException {
    	 Scanner in = new Scanner(System.in);
    	 int numberofTestCases = in.nextInt();
    	 long[] numbers = new long[numberofTestCases];
    	 for(int testcaseCount = 0; testcaseCount < numberofTestCases; testcaseCount++)
    	 {
    		 numbers[testcaseCount] = in.nextLong();
    	 }
    		 
    	 for(int testcaseCount = 0; testcaseCount < numberofTestCases; testcaseCount++)
    	 {
    		 int testcase = testcaseCount+1;
    		 long input = numbers[testcaseCount];
    		 long result = 0;
    		 long greater = nearestAllEvenDigitsNumGreater(input);
    		 
    		 System.out.println("Case #" + testcase + ": " + result);
    		 
    	 } 
	 }
	 
	 public static long nearestAllEvenDigitsNumGreater(long num)
	 {
		long tempnum = num; 
		String digits = "";
		while(tempnum > 0)
		{
			digits = tempnum%10 + digits;
			tempnum = tempnum/10;
		}
		tempnum = 0;
		int index= -1;
		for(int count = 0;count<digits.length();count++)
		{
			if(digits.charAt(count)%2 != 0 )
			{
				index = count;
				break;
			}
		}
		//if no odd number found then return the number itself
		if(index==-1)
		{
			return num;
		}
		else if(index != -1)//if there is an odd number
		{
			if((int)digits.charAt(index) != 9)
			{
				// add all digits till first odd 
			    for (int i = 0; i < index; i++) 
			    {
			    	tempnum = tempnum * 10 + (digits.charAt(i)); 
			    }
			  
				//increase the odd digit by one
			    tempnum = tempnum * 10 +  (digits.charAt(index) + 1);
			    
			    // add 0 to the right 
			    for (int i = index + 1; i < digits.length(); i++) 
			    	tempnum = tempnum * 10; 
			    
			    return tempnum;
			}
			else if(digits.charAt(index) == 9)
			{
				if(index == 0)
				{
					
					return 2* (long)Math.pow(10, digits.length());
				}
				else
				{
					int index2 = -1;
					// traverse towards the left  
				    // to find the non-8 digit 
				    for (int i = index - 1; i >= 0; i--)  
				    {  
				        int digit = digits.charAt(i); 
				  
				        // if digit is not 8, 
				        // then break 
				        if (digit != 8)  
				        { 
				        	index2 = i; 
				            break; 
				        } 
				    }
				
				    //no 8 found
				    if (index2 == -1)
				    {
				    	tempnum = 0;
				    	// add all digits left of first odd 
					    for (int i = 0; i < index ; i++) 
					    {
					    	tempnum = tempnum * 10 + (digits.charAt(i)); 
					    }
					    tempnum = tempnum+2;
					    // add 0 to the right 
					    for (int i = index ; i < digits.length(); i++) 
					    	tempnum = tempnum * 10; 
					    
					    return tempnum; 
				    }
				    else if(index2 != -1)
				    {tempnum = 0;
				    	//if 8 is found
						 // till non-8 digit add all numbers 
						    for (int i = 0; i < index2 ; i++) 
						    	tempnum = tempnum * 10 + (digits.charAt(i)); 
						    tempnum = tempnum+2;
						 // add 0 to the right 
						    for (int i = index2 ; i < digits.length(); i++) 
						    	tempnum = tempnum * 10;  
						    
						    return tempnum; 
				    }
				  
				}
				
			}
			
		}
		return num;
		
		
	 }
		  
	 
 }