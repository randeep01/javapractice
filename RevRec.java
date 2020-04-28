public class RevRec{


	public static void rot(int arr[], int count)
	{
		rev(arr,0,count-1);
		rev(arr,count,arr.length-1);
		rev(arr,0, arr.length-1);
	}


	public static void  rev(int arr[],int start,int end)
	{
		if(start>=end){
			return;
		}

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		rev(arr,start+1,end-1);
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};
		//rev(arr,0,4);

		rot(arr,3);	
		for(int i =0;i<5;i++)
		{
			System.out.print(arr[i] + " ");
		}

	}
}



