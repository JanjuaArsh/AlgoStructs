
import java.math.BigInteger;
import java.util.*;


public class WareHousing {
	
	static void solve(Node firstNode, Node lastNode, int value)
	{
		if(firstNode.next == null && lastNode.previous==null)
        {
        	firstNode.value = value; firstNode.next = lastNode;
            lastNode.previous = firstNode;
        }
        else if(firstNode.next == null && lastNode.previous!=null)
        {
        	if(value>=firstNode.value)//means bigger input/equal input
        	{
        		value = value/lastNode.previous.value;
        		lastNode = lastNode.previous;
        		solve(firstNode,lastNode,value);
        	}
        	else if(value < firstNode.value)//means lesser input
        	{
        		firstNode.previous = lastNode.previous;
        		lastNode.previous.next = firstNode;
        		lastNode.previous = firstNode;
        		firstNode.next = lastNode;
        		
        		firstNode.value = value;
        		firstNode.previous.value = value/firstNode.previous.value;
        	}
        }
        else if(firstNode.next != null && lastNode.previous!=null)
        {
        	if(value>=firstNode.value)//greater equal
        	{
        		value = value/firstNode.value;
        		firstNode = firstNode.next;
        		solve(firstNode,lastNode,value);        		
        	}
        	else if(value<firstNode.value)//lesser
        	{
        		//insert here
        		int tempval = firstNode.value/value;
        		lastNode.value = tempval;
        		firstNode.value = value;
        		firstNode.next.previous = lastNode;
        		lastNode.next = firstNode.next;
        		lastNode.previous = firstNode;
        		firstNode.next = lastNode;
        	}

        }
        else if(firstNode.next != null && lastNode.previous==null)
        {
        	//not happening
        }
	}
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String temp = in.next(); 
        String[] names = temp.split(",");
        HashMap<String,Node> map = new HashMap<String,Node>(); 
        for(int i=0;i<names.length;i++)
        {
            Node obj = new Node(0, null, names[i]);
            map.put(names[i], obj);
        }
        Node currentNode = null;
        for(int i=0;i<names.length-1;i++)
        {
            String first = in.next();
            in.next();
           
            int value = in.nextInt();
            String last = in.next();
            Node firstNode = map.get(first); Node lastNode = map.get(last);
            
            solve(firstNode,lastNode,value);
            
        }
        for(int i=0;i<names.length;i++)
        {
        	Node n = map.get(names[i]);
        	if(n.previous == null)currentNode = n;
        }
       int count = 1;
        while(currentNode.next!= null)
        {
        	System.out.print(count+ currentNode.name + " = ");
        	count = count* currentNode.value;
        	currentNode = currentNode.next;
        }
        System.out.print(count+ currentNode.name);
    }

}
class Node{

	int value = 0;
    Node next = null;
    Node previous = null;
    String name;
    public Node(int value,Node next, String name)
    {
        this.value = value;
        this.next = next;
        this.name = name;
        
    }
}

