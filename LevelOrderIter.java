import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
}
public class LevelOrderIter{
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

	void levelorder(Node root){
		if(root==null){
			System.out.println("tree null");
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		Node n = null;
		while(!q.isEmpty())
		{
			n = q.poll();

			if(n==null)
			{
				if (!q.isEmpty()) { 
					System.out.println("");
					q.add(null);
				}
			}
			else{
				System.out.print(n.data + " " );
				if(n.left!=null)
					q.add(n.left);
				if(n.right!=null)
					q.add(n.right);
			}

		}


	}
	void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);

	}

	public static void main(String args[]){
		LevelOrderIter i = new LevelOrderIter();

		i.createTree();
		i.levelorder(i.root);
		//		i.inorder(i.root);
		//
		}
}

