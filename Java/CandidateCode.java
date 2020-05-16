import java.util.Scanner;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
         int testcases = in.nextInt();
         
         for(int testcase = 0; testcase < testcases; testcase++)
         {
        	 int N = in.nextInt();
        	 PQ villians = new PQ(N);
        	 PQ heros = new PQ(N);
        	 for(int i = 0; i<N; i++)
        	 {
        		 villians.insert(in.nextInt()); 
        	 }
        	 for(int i = 0; i<N; i++)
        	 {
        		 heros.insert(in.nextInt()); 
        	 }
        	 int win = 1;
        	 for(int i = 0; i<N; i++)
        	 {
        		 int hero = heros.extractMax();
        		 int villian = villians.extractMax();
        		 if(villian >= hero)
        		 {
        			 win = 0;
        			 break;
        		 }
        	 }
        	 
        	 if(win == 1)System.out.println("WIN");
        	 else System.out.println("LOSE");
         }
         in.close();
   }
}

class PQ
{
	int size = 0;
	int maxsize;
	int[] H; 
	
	public PQ(int N)
	{
		maxsize = N+1;
		H = new int[maxsize];
	}
	
    int parent(int i)
	{
		return i/2;
	}
    
	int leftChild(int i)
	{
		return 2*i;
	}
	
	int rightChild(int i)
	{
		return (2*i) + 1;
	}
	
	void shiftUp(int i)
	{
		while(i>1 && H[parent(i)] < H[i])
		{
			int hp = H[parent(i)];
			H[parent(i)] = H[i];
			H[i]= hp;
			
			i = parent(i);
		}
	}
	
	void shiftDown(int i)
	{
		int maxIndex = i;
		int l = leftChild(i);
		if(l <= size && H[l] > H[maxIndex] )
		{
			maxIndex = l;
		}
		int r = rightChild(i);
		if(r <= size && H[r] > H[maxIndex])
		{
			maxIndex = r;
		}
		
		if(i != maxIndex)
		{
			//swap H[i] and h[maxIndex]
			int hp = H[maxIndex];
			H[maxIndex] = H[i];
			H[i]= hp;
			
			shiftDown(maxIndex);
		}
	}
	
	void insert(int p)
	{
		if(size == maxsize) return;
		size = size + 1;
		H[size] = p;
		shiftUp(size);
	}
	
	int extractMax()
	{
		int result = H[1];
		H[1] = H[size];
		size--;
		shiftDown(1);
		return result;
	}
}
