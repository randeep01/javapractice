public class RainTrapping{
	public static void main(String args[])
	{
		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

	    calculate(arr);
	//	System.out.println(val);
	}
	public static void  calculate(int[] arr){
		int[] rMax = new int[arr.length];
		int[] lMax = new int[arr.length];
		int n = arr.length-1;
		rMax[n] = arr[n];

		for(int i = n-1; i>=0;i--){
			rMax[i] = Math.max(rMax[i+1],arr[i]);
		}
		for(int i =0;i<=n;i++)

		{
			System.out.print(rMax[i]+",");
		}

		lMax[0] = arr[0];
		for(int i = 1;i<=n;i++){
			lMax[i] = Math.max(lMax[i-1],arr[i]);
		}
		System.out.println("");
		for(int i = 0;i<=n;i++)
		{
			System.out.print(lMax[i]+",");
		}
		System.out.println("");
		int result = 0;
		for(int i = 1;i<=n-1;i++)
		{
			System.out.println(rMax[i] + "::" + lMax[i]);
			result = result + (Math.min(rMax[i],lMax[i])-arr[i]);
		}

		System.out.println(result);
	}
}
