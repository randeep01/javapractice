public class atoi1
{
	public static void main(String args[])
	{
		System.out.println(atoi("-192"));
	}
	public static int atoi(String i)
	{
		int res = 0;
		int sign = 1;
		int idx = 0;
		if(i.charAt(idx) == '-')
		{
			sign = -1;
			idx++;
		}

		for(;idx<i.length();idx++)
		{
			res = res*10 + i.charAt(idx)-'0';
		}

		return res*sign;

	}
}


