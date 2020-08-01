public class IndexArray0108{
	public static void indexArray(int arr[])
	{
		if(arr==null) return;
		for(int i =0;i<arr.length;i++)
		{
			while(arr[i]!=-1 && arr[i] != i)
			{
				swap(arr, i, arr[i]);
			}
		}
	}
	public static void swap(int [] arr, int i, int j)
	{
		int temp = arr[i];
	    arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void print(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
		}
	}
	public static void main(String arg[])
	{
		int arr[] = {1,2,-1,4,-1};
		indexArray(arr);
		print(arr);
	}

}
