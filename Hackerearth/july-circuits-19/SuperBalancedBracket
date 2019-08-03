import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        FastReader in = new FastReader();
        int T = in.nextInt();
        String sequence;
        int count;
        for (int t = 1; t<=T; t++)
        {
             sequence = in.next();  
             count = 0;
             for(int i=0; i<sequence.length() / 2; i++)
             {
                if(sequence.charAt(i) == '(')
                count = count+2;
             }
             System.out.println(count);
        }
    }
    
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
    } 
}
