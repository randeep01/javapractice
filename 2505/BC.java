public class BC{
	public static void main(String args[])
	{
		System.out.println(bc(10,2));
	}
	public static int bc(int n, int c)
	{
	//	nck = n-1ck-1 + n-1ck
		int[][] dp = new int[n+1][n+1];

		for(int i = 0;i<=n;i++){
			dp[i][0] = 1;
		}
		for(int i = 0;i<=n;i++){
			dp[i][i] = 1;
		}

		for(int i= 1 ;i<=n;i++)
		{
			for(int j = 1;j<i;j++)
			{
				dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
			}
		}

		return dp[n][c];

	}


}


