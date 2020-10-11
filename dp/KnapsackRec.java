class KnapsackRec{
	public static void main(String args[])
	{
		int val[] = {60,100,120};
		int wt[] = {10,20,30};
		int W = 50;
		int n = 3;
		System.out.println(knapsack(wt,val,n,W)); 
	}
	public static int knapsack(int wt[],int val[], int n, int W)
	{
		if(n==0 || W ==0)
			return 0;
		if(wt[n-1] <= W)
		{
			return  Math.max((val[n-1] + knapsack(wt,val,n-1,W-wt[n-1])), knapsack(wt,val,n-1,W));

		}
		else 
		{
			return knapsack(wt,val,n-1,W);
		}
		
	}
}	
