public class ReverseRotate{

	static public void reverse(int arr[], int st,int end)
	{
		while(st<end)
		{
			int temp = arr[st];
			arr[st] = arr[end];

			arr[end] = arr[st];
			st++;
			end--;
		}
	}
	static public void rotate(int arr[], int count)
	{
		int len = arr.length;
		reverse(arr,0,count-1);
		reverse(arr,count,len-1);
		reverse(arr,0,len-1);
	}
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};
		for(int i = 0;i<5;i++)
		{
			System.out.println("Rotation with iter " +i );

			rotate(arr,i);

		}
		for (int j =0;j<5;j++)
		{
			System.out.print(arr[j] + " ");

		}

	}
}

