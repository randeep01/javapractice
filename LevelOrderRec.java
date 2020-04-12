import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
}
public class LevelOrderRec{
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


	int height(Node root)
	{
		if(root==null)
			return 0;
		int l  = height(root.left);
		int r = height(root.right);

		if(l<r)
			return r+1;
		return l+1;


	}
	void printLevel(Node node, int level)
	{
		if(node==null){
			return;
		}
		if(level==1)
		{
			System.out.print(node.data);
		}
		else{

			printLevel(node.left,level-1);
			printLevel(node.right, level-1);
			
		}
	}


	void levelorder(Node root){
		int h = height(root);
		System.out.println(h);

		for(int i =1;i<=h;i++)
		{
			printLevel(root,i);
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
		LevelOrderRec i = new LevelOrderRec();

		i.createTree();
		i.levelorder(i.root);
		//		i.inorder(i.root);
		//
		}
}

