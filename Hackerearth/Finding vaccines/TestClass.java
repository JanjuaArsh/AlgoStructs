import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int MainC=0; int MainG=0;
        int index=0;int value=0;
        String MainString = s.next();
        for(int i=0;i<M;i++)
        {
            char temp = MainString.charAt(i);
            if(temp == 'C')
            {
              MainC++;  
            }
            else if(temp == 'G'){MainG++;}
        }
        for(int i=0;i<N;i++)
        {
            int len = s.nextInt();
            int C=0;int G=0;
            String inpStr=s.next();
            for(int j=0;j<len;j++)
            {
                char temp = inpStr.charAt(j);
                if(temp == 'C')
                {
                 C++;  
                }
                else if(temp == 'G'){G++;}
            }
            int temp = (C*MainG)+(G*MainC);
            if(temp>value)
            {
                value=temp;
                index=i+1;
            }
        }
        System.out.println(index);
    }
}
