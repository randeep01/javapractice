public class NoPathMatrix
{
	public static int countPaths(int rowStart,int rowEnd, int colStart, int colEnd)
	{
//		System.out.print(rowEnd + ":" + colEnd + "->");
		if(colEnd == colStart && rowEnd == rowStart){
//			System.out.println(rowEnd + ":" + colEnd);
//			System.out.println("");
			return 0;
		}
		if(colEnd == colStart || rowEnd == rowStart){
//			System.out.print(rowEnd + ":" + colEnd);
			return 1;
		}
		return countPaths(rowStart,rowEnd-1,colStart,colEnd) + countPaths(rowStart, rowEnd, colStart, colEnd-1);


	}
	public static int countPathsDP(int rowStart,int rowEnd, int colStart, int colEnd)
	{
		int dp[][] = new int[rowEnd][colEnd];

		for(int i = 1;i<rowEnd;i++)
		{
			dp[i][0] = 1;
		}

		for(int i =1;i<colEnd;i++)
		{
			dp[0][i] = 1;
		}

		for(int i=1;i<rowEnd;i++)
		{
			for(int j=1;j<colEnd;j++)
			{
				dp[i][j]=dp[i-1][j] + dp[i][j-1];
			}
		}

		return dp[rowEnd-1][colEnd-1] - dp[rowStart-1][colStart-1];
	}
	public static void main(String args[])
	{
		System.out.println(countPathsDP(1,4,1,4));
	}
}

