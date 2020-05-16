
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 

  
public class HealthOfAPerson 
{ 
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
  
    public static void main(String[] args) throws IOException 
    { 
        Reader s=new Reader(); 
        int T = s.nextInt(); 
        int N,M;
        for(int t=0;t<T;t++)
        {
        	 N = s.nextInt(); 
        	 M = s.nextInt(); 
        	 int[] person = new int[N];
        	 int[] day = new int[M];
        	 int[] result = new int[N];
        	 for(int n=0;n<N;n++)
             {
        		 person[n] = s.nextInt();
        		 result[n] = -1;
             }
        	 for(int m=0;m<M;m++)
             {
        		 day[m] = s.nextInt();
             }
        	 
        	 for(int m=1;m<=M;m++)
             {
        		 for(int counter=1;counter*m<=N;counter++)
                 {
            		 if(person[(counter*m) -1 ] <= day[m -1])
            			 {
            			   if(result[(counter*m) -1 ] == -1)
            			 	result[(counter*m) -1 ] = m;
            			 }
                 } 
             }
        	 for(int n=0;n<N;n++)
             {
        		 System.out.println(result[n]);
             }
        	 
        }
     
    } 
} 