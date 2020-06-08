public class Daimeter{
	public static void main(String args[])
	{
	}
	public int diameter(Node root)
	{
		if(root==null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);

		int lDai = daimeter(root.left);
		int rDai = daimeter(root.right);

		int fd = Math.max(lh+rh+1,Math.max(lDai,rDai));
		return fd;
	}
	public void boundary(Node root)
	{
		if(root==null) return ;
		left(root);
		right(root.right);
		leaf(root);


	}
	public void left(Node root)
	{
		if(root==null)
			return;
		if(root.left!=null){
			System.out.print(root.data+" ");
			left(root.left);
		}else if(root.right){
			System.out.println(root.data);
			left(root.right);
		}
	}
	public void right(Node node){
		if(root==null) return;
		if(root.right!=null){
			System.out.println(root.data + " ");
			right(root.right);
		}else if(root.left){
			System.out.println(root.data);
			right(root.left);
		}

	}
	public void leaf(root){
		if(root!=null){
			return ;
		}
		leaf(p.left);
		if(root.left==null && root.right==null)
		{
			System.out.print(root.data);
		}
		leaf(root.right);
	}


}


}
