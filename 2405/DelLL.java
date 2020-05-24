class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this. next = null;
	}
}

class LL{
	Node head = null;

	public Node add(int data)
	{
		Node temp = new Node(data);

		if(head == null){
			head = temp;
		}else{
			temp.next = head;
			head = temp;
		}
		return temp;
	}
	public void print(){
		System.out.println("_____");
		Node curr = head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	public void del(Node node){
		if(node==null) return;
		if(node.next == null) return;

		node.data = node.next.data;
		node.next = node.next.next;
	}
	public Node rev(){
		Node curr =  head;
		Node prev = null;
		Node next = head;
		while(next!=null)
		{
			next = next.next;
			curr.next= prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	public void middle(){
		if(head==null)
			return;
		Node slow = head;
		Node fast = head;

		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle::" + slow.data);

	}

}
public class DelLL{
	public static void main(String args[]){
		LL l = new LL();
		l.add(4);
		l.add(5);
		Node temp =  l.add(1);
		l.add(2);
		l.add(3);
		l.print();
		l.del(temp);
		l.print();
		l.rev();
		l.add(6);
		l.print();
		l.middle();

	}
}
