class Node{
	int data;
	Node next;
	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}
class LL
{
	Node head = null;
	public void addFront(int data)
	{
	   	Node temp = new Node(data,head);
		head = temp;
	}

	public void addRead(int data)
	{
		Node temp = new Node(data,null);
		if(head == null){
			head = temp;
			return;
		}
		Node ptr = head;
		while(ptr != null){
			ptr = ptr.next;
		}
		ptr.next = temp;
	}
	public void reverse()
	{
		Node prev = null;
		Node curr = head;
		Node next = head;

		while(next!=null){
			next = next.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		head = prev;

	}
	public void print(){
		Node ptr = head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr = ptr.next;
		}

	}
	public static void main(String args[])
	{
		LL l = new LL();
		l.addRead(1);
		l.print();

	}


}






