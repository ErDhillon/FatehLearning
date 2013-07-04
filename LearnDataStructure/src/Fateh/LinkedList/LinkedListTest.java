package Fateh.LinkedList;

public class LinkedListTest {
	
	protected LinkedListNode head, tail;
	private int totalcount;
	private int position;
	
	public LinkedListTest() {
		// TODO Auto-generated constructor stub
		head = tail = null;
	}
	
	public String isEmptyList()
	{
		if(head == null)
			return "EmptyList";
		return null;
	}
	
	public int Count()
	{
		return totalcount;
	}
	
	public String AddNodeStart(int position, int data)
	{
		LinkedListNode newNode = new LinkedListNode(data,null);
		LinkedListNode temp = head;
		
		//Adding Node at Beginning of List
		if(position == 0)
		{
		 newNode.next = head;
		 head = newNode;
		 totalcount++;
		 return "Node added at Front";
		}
		//Adding node at End of List
		else if(position == totalcount)
		{
		 int pos = 1;
		 while(temp != null)
		 {
			 if(pos == position)
				 break;
			 else
			 {
				 pos++;
				 temp = temp.next;
			 }
		 }
			newNode.next = temp.next;
		 	temp.next = newNode;
		 	tail = newNode;
		 	totalcount++;	
		}
		//Adding Node at Any position
		else
		{
			while(temp != null)
			{
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp = newNode;
			//tail = newNode;
			totalcount++;			
			return "Node Added at End";
		}
		return null;
	}

	//Delete Node from End
		public void DeleteNodeFromEnd()
		{
		 LinkedListNode temp = head;
		 LinkedListNode prev = null;
		 while(temp.next != null)
		   {
		     prev = temp;
			 temp = temp.next;
		   }
		   prev.next = null;
		   tail = prev;
		   totalcount--;
		}
		public void DeleteNodeFromEndUsingTail()
		{
		  if(head == tail)
		  {
		   head = tail = null;
		   totalcount = 0;
		  }
		  else
			{
			  LinkedListNode temp = head;
			  while(temp.next != tail)
			  {
				  temp = temp.next;
			  }
			    tail = temp;
				temp.next = null;
				totalcount--;
			}
		}
		
		public int Search(int item)
		{
		  int count = 0;
		  LinkedListNode temp = head;
		  if(head.data == item)
		  {
		   return 1;
		  }
		  else
		  {
		   while(temp != null)
		     {
			   if(temp.data == item)
			    {
				  return count;
				}
				temp = temp.next;
				count++;
			 }
		   return -1;
		  }
		}
}
