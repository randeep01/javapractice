public class SquareRoot{
	public static void main(String args[])
	{
		int number = 34;

		System.out.println(sqrt(number));
	}
	public static  int sqrt(int n)
	{
		int l =0;
		int h= n-1;
		int res = 0;
		while(l<=h)
		{
			int mid = (l+h)/2;
			int val = mid*mid;
			if(val==n){
				res= mid;
			}
			if(val<n){
				l = mid+1;
				res = mid;
			}
			if(val>n)
			{
				h = mid-1;
			}
		}

		return res;
	}
}

