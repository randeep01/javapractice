import java.util.*;
class Node
{
	int data;
	Node left;
	Node right;
	// constructor
	Node(int data){
		this.data = data;
		left = null;
		right =null;
	}
}

public class Spiral{
	public static void main(String[] args)
	{
		// Let us create binary tree shown in above diagram
		/*               1
						 /     \
						 2       3
						 /   \       \
						 4     5       6
						 */

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		spiral(root);


	}
	public static Node mirror(Node root)
	{
		if(root==null) return root;


		Node right = mirror(root.right);
		Node left = mirror(root.left);

		root.left = right;
		root.right = left;
		return root;
	}
	public static List<List<Integer>> spiral(Node root)
	{
		List<List<Integer>> list = new ArrayList<>();
		if(root==null)
			return list;
		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		boolean ltr = true;
		while(!queue.isEmpty())
		{
			int size = queue.size();
			List<Integer> l = new ArrayList<>();

			if(ltr){
				for(int i = 0;i<size;i++){
					Node temp = queue.poll();
					l.add(temp.data);
					System.out.print(temp.data+" ");
					if(temp.left != null)
						queue.add(temp.left);
					if(temp.right!=null)
						queue.add(temp.right);
					ltr = false;

				}
			}

			else {
				Stack<Integer> st = new Stack<>();
				for(int i = size;i>=0;i--){
					Node temp = queue.poll();
					l.add(temp.data);
					st.push(temp.data);
					//System.out.print(temp.data+" ");
					if(temp.left != null)
						queue.add(temp.left);
					if(temp.right!=null)
						queue.add(temp.right);
					ltr = true;
				}
				while(!st.isEmpty())
				{
					System.out.print(st.pop()+ " ");
				}
					
			}
			list.add(l);
			System.out.println("");
		}
		return list;
	}
}
