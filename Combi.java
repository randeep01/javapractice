public class Combi{
	public static void main(String args[])
	{
		System.out.println(combi(4,2));
	
	
		System.out.println("red");
	}
	public static  int combi(int n,int k)
	{
		int[][]arr = new int[n+1][n+1];
		for(int i =0;i<n;i++)
		{
			arr[i][0] = 1;
		}
		for(int i = 0;i<n;i++)
		{
			arr[i][i] = 1;
		}
		for(int i = 1 ;i<=n;i++){
			for(int j=1;j<i;j++)
			{
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}

		return arr[n][k];


	}

}
