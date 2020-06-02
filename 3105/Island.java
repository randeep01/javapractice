class Island{
	public static void main(String args[])
	{
		int [][] arr = {{1,0,0},
			{0,0,1},
			{0,1,1}};

		System.out.println(findisland(arr));
	}
	public static int findisland(int[][]arr){
		int count = 0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++){
				if(arr[i][j] == 1){
					count++;
					dfs(arr,i,j);
				}
			}
		}
		return count;
	}
	public static void dfs(int[][] arr,int i,int j)
	{
		if(i>=arr.length || i<0 ||j<0||j>=arr.length|| arr[i][j] == 0){
			return;
		}
		arr[i][j] = 0;
		dfs(arr,i-1,j);
		dfs(arr,i+1,j);
		dfs(arr,i,j-1);
		dfs(arr,i,j+1);
	}
}

