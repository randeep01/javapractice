public class KnapsackDP{
	public static void main(String args[])
	{
		int val[] = {60,100,120};
		int wt[] = {10,20,30};
		int w = 50;
		int n = val.length;
		System.out.println(knapsack(val,wt,w,n)); 		
	}
	public static int knapsack(int[] val, int wt[], int w, int n){
		int[][] t = new int[n+1][w+1];
		for(int i =0;i<=n;i++){
			for(int j =0;j<=w;j++){
				if(i ==0 || j == 0) t[i][j] = 0;	
				else if (wt[i-1] <=j){
					t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]],t[i-1][j]);
				}else
					t[i][j] = t[i-1][j];

			}
		}
		
		return t[n][w];	
	}
}
