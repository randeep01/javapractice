import java.util.*;

public class Mirror{

	static class Node 
	{ 
		int data; 
		Node left; 
		Node right; 
	}; 

	/* Helper function that allocates a new node 
	   with the given data and null left and right 
	   pointers. */
	static Node newNode(int data) 
	{ 
		Node node = new Node(); 
		node.data = data; 
		node.left = node.right = null; 
		return(node); 
	} 

	public static void main(String args[]) 
	{ 
		Node root = newNode(1); 
		root.left = newNode(2); 
		root.right = newNode(3); 
		root.left.left = newNode(4); 
		root.left.right = newNode(5); 

		/* Print inorder traversal of the input tree */
		System.out.print( "\n Inorder traversal of the"
				+" coned tree is \n"); 
		inorder(root); 

		/* Convert tree to its mirror */
		root = mirror_rec(root); 

		/* Print inorder traversal of the mirror tree */
		System.out.print( "\n Inorder traversal of the "+ 
				"mirror tree is \n"); 
		inorder(root); 
	} 
	public static void mirror(Node node)
	{
		if(node == null) return ;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty())
		{
			Node curr = q.poll();

			Node temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;

			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}

	}
	public static Node mirror_rec(Node node)
	{
		if(node == null) return node;
		Node left = mirror_rec(node.left);
		Node right = mirror_rec(node.right);

		node.left = right;
		node.right = left;

		return node;
	}
	public static void inorder(Node root){
		if(root == null) return;

		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}
}
