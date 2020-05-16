import java.util.Scanner;

public class ReccurSum {
    static int K1,K2;
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int T = in.nextInt();
      int X,N;
      boolean[] cantJump = new boolean[100000];
      for(int t=0;t<T;t++)
      {
          X = in.nextInt();
          N = in.nextInt();
          K1 = in.nextInt();
          K2 = in.nextInt();
          for(int n=0;n<N;n++)
          {
             cantJump[in.nextInt()] = true;
          }
          call(X,N,cantJump);
      }
    }
    static void call(int X,int N,boolean[] cantJump)
    {
      int intresult = reccur(X,cantJump,K1,1, false);
      if(intresult == -1)
      {
          System.out.println("no");
      }
      else
      {
         System.out.println("yes"); 
         System.out.println(intresult); 
      }
    }
    static int reccur(int X,boolean[] cantJump, int currentPoint,int jumps, boolean jumpedback)
    {
        if(X == currentPoint)
        {
            return jumps;
        }
        if(currentPoint == 0)
        {
            return -1;
        }
        if(cantJump[currentPoint])
        {
            return -1;
        }
        else
        {
        	cantJump[currentPoint] = true;
        }
        if(X < currentPoint-K2)
        {
            return -1;
        }
        if(!jumpedback)
        {
        	return Math.max(reccur(X,cantJump,currentPoint+K1,jumps+1 , false),reccur(X,cantJump,currentPoint-K2,jumps+1 ,true));
        }
        else
        {
            return reccur(X,cantJump,currentPoint+K1,jumps+1 ,false);
        }
    }
}