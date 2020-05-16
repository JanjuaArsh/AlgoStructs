import java.io.*;
import java.util.*;


public class TestClass101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] NK = br.readLine().split(" ");
            int N = Integer.parseInt(NK[0]);
            int K = Integer.parseInt(NK[1]);
            String[] arr_arr = br.readLine().split(" ");
            int[] arr = new int[N];
            for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
            {
            	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
            }

            int out_ = Solution(N, K, arr);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static int Solution(int N, int K, int[] arr)
    {
        // Write your code here
        int result = -1;
        int[] array = new int[K];
        for(int i_a=0;i_a<K;i_a++)
        {
            array[i_a]=-1;
        }
        int minlen = N + 1; 
        int curlen = N + 1;
        int sum=0;int aa=0;int bb=0;

         for (int i = 0; i < N; i++) 
         { 
            sum += arr[i]; 
            sum %= K; //System.out.println("sum"+ sum);
            if (array[sum] == -1 && sum == 0) 
                curlen = i + 1;
            if (array[sum] != -1) 
                curlen = i - array[sum]; 
            if (curlen < minlen) { 
                minlen = curlen;
                aa = array[sum] + 1; 
                bb = i; 
            }
         array[sum] = i; 
         }
        //System.out.println("aa"+ aa);
         //System.out.println("bb"+ bb);
         
         result = bb-aa+1;
    
         
        return result;
    }
}