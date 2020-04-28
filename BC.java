public class BC{
	public static void main(String args[]){
		int n =100;
		int k = 4;

		System.out.println(bc(n,k));
	}
	static public int bc(int n,int r)
	{
		int arr[][] = new int[n+1][n+1];

		// precompute value of nc0 i.e. 1
		for(int i =0;i<n;i++)
			arr[i][0] = 1;
		// precompute value of ncn i.e. 1
		for(int i = 0;i<n;i++)
			arr[i][i] = 1;

		for(int i = 1;i<=n;i++)
		{
			for(int j=1;j<i;j++){
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}

		}
		return arr[n][r];

	}


}
