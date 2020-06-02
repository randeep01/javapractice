class SetBits{
	public static void main(String args[])
	{
		int a = -1;
		System.out.println(countset(a));
	}
	public static int countset(int a)
	{
		int count = 0;
		while(a!=0){
			a &=(a-1);
			count++;
		}
		return count;
	}
}

