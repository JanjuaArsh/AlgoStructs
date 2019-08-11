import java.io.*;
import java.util.*;


public class INdeedDivisible {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         String out_ = solve(A);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String solve(int[] A){
    	int result = 0;
    	int count = 1;
    	int first, last;
        for(int i=0; i<=(A.length/2)-1;i++)
        {
        	first = firstDigit(A[i]);
        	result = result + (first*count);count = count* (-1);
        }
        for(int i=A.length/2; i<A.length;i++)
        {
        	last = A[i]%10;
        	result = result + (last*count);count = count* (-1);
        }
        String answer;
        if(result%11 == 0)
        {
        	answer = "OUI";
        }
        else answer = "NON";
        return answer;
    }
    static int firstDigit(int n) 
    { 
        while (n >= 10)  
            n /= 10; 
        return n; 
    } 
}
