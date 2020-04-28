public class Power{
	public static void main(String args[]){
		System.out.println(power_e(4,3));


	}
	static int  power(int a,int b)
	{
		if(b == 0)
			return 1;
		else if(b%2==0)
			return power(a,b/2)*power(a,b/2);
		else 
			return power(a,b/2)*power(a,b/2)*a;
	}
	static int  power_e(int a,int b)
	{
		if(b == 0)
			return 1;

		int temp = power_e(a,b/2);
	    if(b%2==0)
			return temp * temp;
		else 
			return temp * temp *a;
	}

}

