public class Fib
{
	public static void main(String args[])
	{
		int number = 10;

		System.out.println(fib1(number));
	}
	public static int fib(int n)
	{
		int f[] = new int[n+2];
		f[0] = 0;
		f[1] = 1;

		for(int i = 2;i<=n;i++)
		{
			f[i] = f[i-1]+f[i-2];
			System.out.println(f[i]);
		}
		return f[n];
	}


	public static int fib1(int n)
	{
		int arr[] = new int[n+2];

		arr[0] = 0;
		arr[1] = 1;

		for(int i = 2;i<=n;i++)
		{
			arr[i] = arr[i-1]+arr[i-2];
			System.out.println(arr[i]);
		}
		return arr[n];

	}















}

