public class BalancedParen{
	public static void main(String args[])
	{
		int n = 3;
		char arr[] = new char[n*2];
		balancedParen(arr,n);
	}
	static void balancedParen(char[] arr, int n)
	{
		int left= 0;
		int right = 0;
		int index = 0;

		util(arr,index,left,right,n);
	}
	static public void util(char arr[],int index, int left, int right, int n)
	{
		if(right==n)
		{
			for(int i=0;i<arr.length;i++) 
				System.out.print(arr[i]); 
			System.out.println(); 
			return;
		}
		else{
			if(right<left){
				arr[index] = ')';
				util(arr,index+1,left,right+1,n);

			}
			if(left<n)
			{
				arr[index]= '(';
				util(arr,index+1,left+1,right,n);
			}
		}
	}
}
