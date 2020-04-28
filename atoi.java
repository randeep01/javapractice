
public class atoi{
	public static void main(String args[])
	{
		String str = "-11121";
		
		int i = atoi(str);
		System.out.println(i);
	}
	public static int atoi(String str)
	{
		int res  = 0;
		int sign = 1;
		int idx = 0;
		if(str.charAt(idx) == '-')
		{
			sign = -1;
			idx++;
		}
		for(;idx<str.length();idx++)
		{
			res = res*10 + str.charAt(idx) - '0';
		}
		return sign *res;

	}
}


