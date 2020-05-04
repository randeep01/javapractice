public class MaxSetBits{
	public static void main(String args[]){
		int n = 324334;
		bin(n);

		int maxIsland = max(n);
		System.out.println("number of max ones:: " + maxIsland);
	}
	public static int max(int n)
	{
		int count = 0;
		while(n>0){
			n = n&(n<<1);
			count++;
		}
		return count;
	}
	public static  void bin(int num)
	{
		if(num>1)
			bin(num/2);
		System.out.print(num%2);
	}

}
