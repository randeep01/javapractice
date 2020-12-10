package dp;



public class KnapsackFull {
    static int[][] t = new int[4][51];
    public static void main(String args[]){
        int val[] = {60,100,120};
        int wt[] = {10,20,30};
        int W = 50;
        int n = 3;
        //int[][] t = new int[n+1][W+1];
        for(int i =0;i<n;i++){
            for(int j =0;j<W;j++){
                t[i][j] = -1;
            }
        }
        int maxProfit = knapsackRec(wt,val, W, n);
        System.out.println("max profit rec" + maxProfit);
        maxProfit = knapsackMemo(wt,val,W,n);
        System.out.println("max profit mem" + maxProfit);
        maxProfit = knapsackDP(wt,val,W,n);
        System.out.println("max profit top down" + maxProfit);
    }
    static int knapsackRec(int[] wt, int[] val, int W, int n){
        if(W==0||n==0)
            return 0;
        if(wt[n-1] <= W){
            return Math.max(val[n-1] + knapsackRec(wt,val,W-wt[n-1],n-1),knapsackRec(wt,val,W,n-1));
        }
        else{
            return knapsackRec(wt,val,W,n-1);
        }
    }
    static int knapsackMemo(int[] wt, int[] val, int W, int n){
        if(n == 0||W == 0)
            return 0;
        if(t[n][W]!=-1){
            return t[n][W];
        }
        if(wt[n-1] <= W){
            return t[n][W] = Math.max(val[n-1] + knapsackMemo(wt, val, W-wt[n-1], n-1),knapsackMemo(wt, val, W, n-1));
        } else {
            return knapsackRec(wt, val, W, n-1);
        }
    }
    static int knapsackDP(int[] wt, int[] val, int W, int n){
        int [][]dp = new int[n+1][W+1];
        for(int i= 0;i<n+1;i++){
            for(int j = 0;j<W+1;j++){
                if(i==0||j==0){
                    dp[i][j] = 0;
                }
                else if(wt[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]],dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];

                }
            }
        }
        return dp[n][W];
    }
}
