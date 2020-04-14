public class SelectionSort{
	public static void main(String args[])
	{
		int arr[] = {1,4,3,5,65,32,4};
		ss(arr);
		print(arr);
	}
	public static void ss(int[] arr)
	{
		int n = arr.length;
		int min = 0;
		for(int i =0;i<n-1;i++)
		{
			min = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
				if(min!=i)
				{
					int temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}

			}
		}
	}
	public static void print(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
