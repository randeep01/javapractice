public class RevArray{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};

		rev(arr,0,arr.length-1);
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
	public static void rev(int[] arr,int start, int end){
		if(start>end)
			return;
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
		rev(arr,start+1,end-1);
	}

}

