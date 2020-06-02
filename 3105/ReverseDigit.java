public class ReverseDigit{
	public static void main(String arg[])
	{
		System.out.println(reverse(1));	
		System.out.println(reverse(-1));
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(1234));
		System.out.println(reverse(15434));
	}
	public static int reverse(int val)
	{
		int sign  = 1;
		if(val<0){
			sign = -1;
			val = val *-1;
		}
		int result =0;
		while(val>0){
			int digit = val%10;
			val = val/10;
			result = result*10 + digit;
		}
		return result*sign;

	}

}


