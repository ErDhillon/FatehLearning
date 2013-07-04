package Fateh.LinkedList;

public class LinkedListNode {
	public int data;
	public LinkedListNode next;
	
	public LinkedListNode(int i) {
		// TODO Auto-generated constructor stub
		data = i;
	}
	
	public LinkedListNode(int i, LinkedListNode n)
	{
		data = i;
		next = n;
	}
}
