class ReverseArray{


	public static int[] reverse(int arr[])
	{
		int l =0;
		int h = arr.length -1;
		while(l<h)
		{
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
		return arr; 
	}
	public static void print(int [] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,8};


		int rarr[] = reverse(arr);
		print(rarr);

	}
}

