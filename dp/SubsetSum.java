public class SubsetSum{
	public static void main(String args[])
	{
		int[] arr = {1,2,45,3};
		int val = 48;
		int n = 0;
		boolean isExist = subsetSum(arr,val,n);
		System.out.println(isExist);
	}
	public static boolean subsetSum(int[] arr, int val,int n)
	{
		if(val == 0) return true;
		if(n==0 ) return false;
		if(arr[n-1] > val) return subsetSum(arr,val,n-1);
		else return subsetSum(arr,val,n-1) || subsetSum(arr,val-arr[n-1],n-1);
		
	}		
}
