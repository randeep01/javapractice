public class Rotate{
	public static void main(String args[])
	{
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print(arr);
		rotate(arr);
		print(arr);

	}
	public static void rotate(int arr[][])
	{
		//traspose
		int N = arr.length;


		for(int i =0;i<N;i++){
			for(int j=i;j<N;j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		print(arr);
		//swap accross vertical axis
		for(int i =0;i<N;i++)
		{
			for(int j=0;j<N/2;j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[i][N-1-j];
				arr[i][N-1-j] = temp;
			}
		}
	}
	public static void print(int arr[][])
	{
		System.out.println("_________________________");
		for(int i=0;i<arr.length;i++)
		{
			for(int j =0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
