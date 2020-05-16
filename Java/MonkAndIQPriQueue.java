import java.util.Scanner;

//min heap
//with ids retained
public class MonkAndIQPriQueue {
	static int[][] H; 
	static int size;
	static int maxsize;
	static int priority;
	static int x1;
	static int x2;
	static int count;
	static int id;
	
	public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
		 int C = in.nextInt();
		 int P = in.nextInt();
		 int N = in.nextInt();
		 
		 int[] IQstudents = new int[N+1];
		 
		 for(int i = 1; i<N+1;i++)
		 {
			 IQstudents[i] = in.nextInt();
		 }
		 
		 H = new int[C+1][5];
		 size = 0;
		 maxsize = C;
		 for(int i = 1; i<C+1;i++)
		 {
			 if(C == N)//each course gets one student
			 {
				 insert(i,0,IQstudents[i],1);
			 }
			 else if(C>N)//some courses remain empty
			 {
				 if(i <= N) {insert(i,0,IQstudents[i],1);}
				 else {insert(i,0,0,0);}
			 }
		 }
		 for(int i = 1; i<P+1;i++)
		 {
			 int x = in.nextInt();
			 extractMin();
			 System.out.print(id + " ");
			 insert(id,x2, x, ++count);
		 }
		 
	}
	
	static void getMin()
	{
		priority = H[1][0];
		x1 = H[1][1];
		x2 = H[1][2];
		count = H[1][3];
		id = H[1][4];
	}
	
	static void insert(int id1, int x11, int x21,int count1)
	{
		if(size == maxsize) return;
		size = size + 1;
		H[size][1] = x11;
		H[size][2] = x21;
		H[size][3] = count1;
		H[size][4] = id1;
		H[size][0] = (x11+ x21)*count1;
		shiftUp(size);
	}
	
	static int parent(int i)
	{
		return i/2;
	}
	static int leftChild(int i)
	{
		return 2*i;
	}
	static int rightChild(int i)
	{
		return (2*i) + 1;
	}
	
	static void shiftUp(int i)
	{
		while(i>1 && (H[parent(i)][0] > H[i][0] || (H[parent(i)][0] == H[i][0] && H[parent(i)][4] > H[i][4])))
		{
			int hp = H[parent(i)][0];
			H[parent(i)][0] = H[i][0];
			H[i][0]= hp;
			
			int x1 = H[parent(i)][1];
			H[parent(i)][1] = H[i][1];
			H[i][1]= x1;
			
			int x2 = H[parent(i)][2];
			H[parent(i)][2] = H[i][2];
			H[i][2]= x2;
			
			int count = H[parent(i)][3];
			H[parent(i)][3] = H[i][3];
			H[i][3]= count;
			
			int id = H[parent(i)][4];
			H[parent(i)][4] = H[i][4];
			H[i][4]= id;
			
			i = parent(i);
		}
	}
	
	static void shiftDown(int i)
	{
		int maxIndex = i;
		int l = leftChild(i);
		if(l <= size && (H[l][0] < H[maxIndex][0] || (H[l][0] == H[maxIndex][0] && H[l][4] < H[maxIndex][4])))
		{
			maxIndex = l;
		}
		int r = rightChild(i);
		if(r <= size && (H[r][0] < H[maxIndex][0] || (H[r][0] == H[maxIndex][0] && H[r][4] < H[maxIndex][4])))
		{
			maxIndex = r;
		}
		
		if(i != maxIndex)
		{
			//swap H[i] and h[maxIndex]
			int hp = H[maxIndex][0];
			H[maxIndex][0] = H[i][0];
			H[i][0]= hp;
			
			int x1 = H[maxIndex][1];
			H[maxIndex][1] = H[i][1];
			H[i][1]= x1;
			
			int x2 = H[maxIndex][2];
			H[maxIndex][2] = H[i][2];
			H[i][2]= x2;
			
			int count = H[maxIndex][3];
			H[maxIndex][3] = H[i][3];
			H[i][3]= count;
			
			int id = H[maxIndex][4];
			H[maxIndex][4] = H[i][4];
			H[i][4]= id;
			
			shiftDown(maxIndex);
		}
	}
	
	static void extractMin()
	{
		getMin();
		H[1][0] = H[size][0];
		H[1][1] = H[size][1];
		H[1][2] = H[size][2];
		H[1][3] = H[size][3];
		H[1][4] = H[size][4];
		size--;
		shiftDown(1);
	}
}
