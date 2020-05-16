import java.io.IOException;
import java.util.Scanner;

public class MaximumMoney {
	 public static void main(String[] args) throws IOException {
    	 Scanner in = new Scanner(System.in);
    	int N,X,Y,Z;
    	 N = in.nextInt();
    	 
    	 X = in.nextInt();
    	 Y = in.nextInt();
    	 Z = in.nextInt();
    	 
    	 int Xleft = X;
    	 int Yleft = Y;
    	 int Zleft = Z;
    	 
    	 int maxA = 0; int indexA = 0;
    	 int maxB = 0; int indexB = 0;
    	 int maxC = 0; int indexC = 0;
    	 
    	 int[][]  values = new int[N][3]; 
    	 
    	 long result = 0;
    	for(int count = 0; count<N; count++)
    	{
    		values[count][0] = in.nextInt();
    		if(values[count][0] > maxA) {indexA = count; maxA = values[count][0];}
    		values[count][1] = in.nextInt();
    		if(values[count][1] > maxB) {indexB = count; maxB = values[count][1];}
    		values[count][2] = in.nextInt();
    		if(values[count][2] > maxC) {indexC = count; maxC = values[count][2];}
    	}
    	 if(Xleft == 0) maxA=0;
    	 if(Yleft == 0) maxB=0;
    	 if(Zleft == 0) maxC=0;
    	for(int count = 1; count<=N; count++)
    	{
    		//A id greatest
    		if(maxA >= maxB && maxA >= maxC && Xleft!=0)
    		{
    			result = result + (long)maxA;
    			Xleft--;
    			values[indexA][0] = -1;
    			values[indexA][1] = -1;
    			values[indexA][2] = -1;
    		}
    		else if(maxB >= maxA && maxB >= maxC && Yleft!=0)//B is greatest
    		{
    			result = result + (long)maxB;
    			Yleft--;
    			
    			values[indexB][0] = -1;
    			values[indexB][1] = -1;
    			values[indexB][2] = -1;
    		}
    		else if(maxC >= maxA && maxC >= maxB && Zleft!=0)//C is greatest
    		{
    			result = result + (long)maxC;
    			Zleft--;
    			
    			values[indexC][0] = -1;
    			values[indexC][1] = -1;
    			values[indexC][2] = -1;
    		}
    		maxA = 0;
    		maxB = 0;
    		maxC = 0;
    		//find max a,b c again
        	for(int i = 0; i<N; i++)
        	{
        		if(values[i][0] > maxA && Xleft!=0) {indexA = i; maxA = values[i][0];}
        		
        		if(values[i][1] > maxB && Yleft!=0) {indexB = i; maxB = values[i][1];}
        		
        		if(values[i][2] > maxC && Zleft!=0) {indexC = i; maxC = values[i][2];}
        	}
        	if( Xleft==0 && Yleft==0 && Zleft==0)break;
    			 
    	}
    	 System.out.println(result);
	 }

}
