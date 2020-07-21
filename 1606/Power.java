
public class Power{

	public static  int power(int a, int b)
	{
		if(b ==0){
			return 1;
		}
		if(b%2==0){
			return power(a,b/2)*power(a,b/2);
		}
		if(b%2!=0){
			return power(a,b/2)*power(a,b/2)*a;
		}
		return 0;
	}
		public static void main(String arg[]){
			int a = 3;
			int b  = 2;
			System.out.println(power(a,b));
		}
	}
