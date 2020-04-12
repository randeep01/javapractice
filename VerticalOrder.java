import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
}
public class VerticalOrder{
	Node root = null;
	public void createTree()
	{
		Node a = new Node();
		a.data =1;


		Node  b = new Node();
		b.data = 2;


		Node c = new Node();
		c.data = 3;

		Node  d= new Node();
		d.data = 4;

		Node  e= new Node();
		e.data = 5;


		Node  f= new Node();
		f.data = 6;

		Node  g= new Node();
		g.data = 7;


		Node h = new Node();
		h.data = 8;


		a.left = b;
		a.right= c;
		b.left = d;
		b.right =e;
		c.left = f;
		c.right = g;
		d.left = h;
		root = a;

	}
	void verticalorder(Node root, int hd, TreeMap<Integer,Vector<Node>> m)
	{
		if(root== null)
			return;
		Vector<Node> val = m.get(hd);

		if(val == null)
		{
			val = new Vector<>();
			val.add(root);
		}
		else{
			val.add(root);

		}

		m.put(hd,val);

		verticalorder(root.left,hd-1,m);
		verticalorder(root.right,hd+1,m);

	}
	void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);

	}
	void printVertical(Node root)
	{

		TreeMap<Integer,Vector<Node>> map = new TreeMap<>();
		verticalorder(root,0,map);


		Set<Integer> keys = map.keySet();

		Iterator<Integer> iter = keys.iterator();

		while(iter.hasNext()){
			Integer val = iter.next();
			Vector<Node> nodes = map.get(val);
			System.out.println("------"+ val+ "---------");
			for(Node n : nodes){
				System.out.print(n.data + " ");
			}
			System.out.println("");

		}


	}

	public static void main(String args[]){
		VerticalOrder i = new VerticalOrder();

		i.createTree();
		//		i.inorder(i.root);
		//
		i.printVertical(i.root);		



		}
}

