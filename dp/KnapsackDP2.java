public class KnapsackDP2{
	
	public static void main(String args[])
	{
		int wt[] = {10, 20, 30};
		int val[] = {60, 100, 120};
		int W = 50;
		int n = 3;
		int max = kp(wt,val,n,W);
		System.out.println(max);
	}
	public static int kp(int[] wt, int[] val, int n, int W)
	{
		int t[][] = new int[n+1][W+1];
		for(int i =0;i<=n;i++){
			for(int j = 0;j<=W;j++)
			{
				if(i==0||j==0)
					t[i][j] = 0;
				else if(wt[i-1] > W)
					t[i][j] = t[i-1][j];
				else if(wt[i-1] <= W)
					t[i][j] = Math.max(val[i-1]+t[i-1][W-wt[i-1]],t[i-1][j]);
			}
		}
		return t[n][W];
	}

}
