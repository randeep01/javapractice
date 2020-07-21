public class Power2107{
	public static void main(String arg[]){
		int a = 2;
		int n = 4;

		System.out.println(power(a,n));

	
	}
	public static int power(int a,int n)
	{
		if(n == 0)
			return 1;
		int temp = power(a,n/2);
		if(n%2==0)
			return temp*temp;
		else
			return temp*temp*a;
	}

}
