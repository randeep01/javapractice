public class BinarySearch0108
{
	public static int bs(int arr[],int k)
	{
		int m =0;
		int l = 0;
		int h = arr.length-1;

		while(l<=h)
		{
			 m = l+(h-l)/2;
			if(arr[m] == k){
				return m;
			}else{
				if(arr[m] < k){
					l = m+1;
				}else{
					h = m-1;
				}
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7};
		int k = 5;
		System.out.println(bs(arr,k));
	}
}



