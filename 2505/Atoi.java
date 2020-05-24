public class Atoi
{
	public static void main(String args[])
	{
		System.out.println(atoi("-232"));
		System.out.println(atoi("232"));
		System.out.println(atoi(""));
	}
	public static int atoi(String val){
		if(val==null||val.equals(""))
			return 0;
		int sign  =1;
		int idx = 0;
		if(val.charAt(idx) == '-'){
			sign = -1;
			idx++;
		}
		int res = 0;
		for(;idx<val.length();idx++)
		{
			res = res*10 + val.charAt(idx) - '0';
		}
		return sign*res;


	}
}
