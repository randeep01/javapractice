public class Power{
	public static void main(String args[]){

		System.out.println((double)power(2,-3));

	}
	public static double power(int i,int n)
	{
		if(n<0){
			return 1/powerutils(i,-1*n);
		}
		return powerutils(i,n);
	}
	public static double powerutils(int i,int n){
		if(n ==0) return 1;
		double temp = power(i,n/2);

		if(n%2==0)
		 return temp*temp;
		else
		return temp*temp*i;	
	}
}
