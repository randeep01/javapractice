class Node{
	int data;
	Node next;
	Node prev;
	public Node(int data)
	{
		this.data = data;
	}

}
public class DLL{
	Node head=null;
	Node tail=null;

	public void insertAtEnd(int data)
	{
		Node temp = new Node(data);
		if(head == null && tail == null)
		{
			head = tail = temp;
		}
		else
		{
			tail.next = temp;
			temp.prev = tail;
			tail = node;
		}

	}
	public void insertAtBeg(int data)
	{
		Node temp = new Node(data);
		if(head == null)
		{
			head = tail = temp;
		}
		else
		{
			head.prev = temp;
			node.next = head;
			head = node;
		}

	}

	public void insertAtPos(int data, int pos)
	{

	}

	public Node removefromBeg()
	{
		if(head == null)
		{
			return null;
		}
		Node temp = head;
		head = head.next;
		head.prev.next = null;
		head.prev = null;
		return temp;
	}
	public Node removeFromEnd()
	{
		if(head==null)
		{
			return null;
		}
		Node temp = tail;
		tail = tail.prev;
		tail.next.prev = null;
		tail.next = null;
		return temp;


	}
	public Node removeNode(Node node)
	{
		if(head == null)
			return null;
		if(node == null)
			return head;

		if(node==head){
			return removeFromBeg();
		}
		else if(node== tail){
			return removeFromEnd();
		}
		else{
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
	
	}
	public static void main(String args[]){
		
	}



}	
