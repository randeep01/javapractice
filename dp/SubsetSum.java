public class SubsetSum{

	public static void main(String args[])
	{
		int arr[] = {1,23,4,2};
		int sum = 1;
		int n = arr.length;
		System.out.println(subsetSum(arr,sum,n));
	}
	public static  boolean subsetSum(int[] arr, int sum,int n){
		if(sum ==0)
			return true;
		if(n == 1)
			if(arr[n-1] == sum)
				return true;
			else
				return false;
		return subsetSum(arr, sum - arr[n-1], n-1) | subsetSum(arr, sum, n-1); 		
	}
}
