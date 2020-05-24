public class Fib{

	public static void main(String args[]){

		System.out.println("dp " + fibdp(12));
		System.out.println("rec" + fibrec(12));

	}

	public static int fibdp(int n){
		int fib[] = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;

		for(int i =2;i<=n;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];

		}
		return fib[n];
	}

	public static int fibrec(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibrec(n-1) + fibrec(n-2);

	}
}

