public class KnapsackRecMem{
	
	public static void main(String arg[])
	{
		int wt[] = {10,20,30};
		int val[] = {60,100,120};	
		int n = wt.length;
		int W = 50;
		int[][] t = new int[n+1][W+1];
		for(int i=0;i<t.length;i++){
			for(int j=0;j<t[0].length;j++){
				t[i][j] = -1;
			}
		}
		int max= knapsack(wt,val,n,W,t);
		System.out.println(max);
	}
	public static int knapsack(int[] wt, int[] val, int n, int W,int[][] t){
		
		if(n==0 || W==0) return 0;
		
		if(t[n][W]!=-1)return t[n][W];

		if(wt[n-1] <=W) 
			return (t[n][W] = Math.max(val[n-1] + knapsack(wt,val,n-1,W-wt[n-1],t),knapsack(wt,val,n-1,W,t)));
		else
			return (t[n][W] = knapsack(wt,val,n-1,W,t));
	}
		
}
