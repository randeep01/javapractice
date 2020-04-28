class Node{
	int data;
	Node left;
	Node right;
}
public class TreeDiameter{
	public static void main(String args[])
	{
		Node root = null;
		int td = treeDiameter(root);

	}

	public static int treeDiameter(Node root)
	{
		if(root == null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		int rDai = treeDiameter(root.right);
		int lDia = treeDiameter(root.left);

		int td = Math.max(lh+rh+1,Math.max(rDai,lDia));

		return td;
	}
	public static int height(Node root)
	{
		if (root == null)
			return 0;

		int lh = height(root.left);
		int rh = height(root.left);

		if(lh>rh)
			return lh+1;
		return rh+1;
	}


}
