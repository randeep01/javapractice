public class MaxSubArraySum0108
{
	public static int maxSubArraySum(int[] arr)
	{
		if(arr==null) return 0;
		int globalmax = 0;
		int localmax = 0;
		for(int i = 0;i<arr.length;i++)
		{
			localmax = localmax + arr[i];
			if(localmax<0){
				localmax = 0;
			}
			if(localmax>globalmax){
				globalmax = localmax;
			}
		}
		return globalmax;

	}
	public static void main(String args[]){
		int arr[] = {-1,2,3,4,-7,2};
		System.out.println(maxSubArraySum(arr));
	
	
	}

}

