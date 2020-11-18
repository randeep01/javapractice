public class GridPaths
{
	public static void main(String args[])
	
	{
		System.out.println(numPaths(3,3));
	}
	static int numPaths(int m ,int n)
	{
		if(m==0 ||n==0) return 1;
		return numPaths(m,n-1) + numPaths(m-1,n);
	}
	
}
