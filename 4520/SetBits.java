public class SetBits{
	public static void main(String args[])
	{
		int number  = 7;
		int count = noSetBits(number);
		System.out.println("No of set bits" + count);
	}
	public static  int noSetBits(int number)
	{
		int count = 0;
		while(number!=0)
		{
			number = number&(number-1);
			count++;
		}
		return count;
	}
}

