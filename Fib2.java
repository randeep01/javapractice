public class Fib2
{
	public static void main(String args[]){
		int i = 12;
		System.out.println(fib(i));	

	}

	static int fib(int n)
	{
		int f[] = new int[n+2];


	    f[0] = 0;
		f[1] = 1;

		for(int i=2;i<=n;i++){
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
}

