
public class Lis{
	public static void main(String args[]){
		int[] arr = {1,3,5,2,5,5,3,2};
		System.out.println(lis(arr));


	}
	public static int lis(int [] arr){
		if(arr==null || arr.length==0){
			return 0;
		}
		int N = arr.length;
		int dp[] = new int[N];
		for(int i=0;i<N;i++)
		{
			dp[i] = 1;
		}
		for(int i =1;i<N;i++)
		{
			for(int j=0;j<i;j++){
				if(arr[i] > arr[j]&&dp[i] < dp[j]+1){
					dp[i] = dp[j] +1;
				}
			}
		}
		int max = 0;
		for(int i =0;i<N;i++)
		{
			if(max<dp[i]){
				max = dp[i];
			}
		}
		return max;

	}


}

