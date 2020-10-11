import java.lang.Math;
public class RainWater
{
	public static void main(String args[])
	{
		int arr[] = {3,0,0,2,0,4};
		printArr("Array", arr);
		int tw = trappedWater(arr);
		System.out.println("Trapped water " + tw);
		
	}
	public static int trappedWater(int water[])
	{
		int[] maxL = new int[water.length];
		int[] maxR = new int[water.length];

		maxL[0] = water[0];
		for(int i = 1;i<water.length;i++)
		{
			maxL[i] = Math.max(water[i], maxL[i-1]);
		}
		maxR[water.length-1] = water[water.length-1];
		for(int i=water.length-2;i>=0;i--)
		{
			maxR[i] = Math.max(water[i],maxR[i+1]);
		}
		printArr("left", maxL);
		printArr("right", maxR);

		int res = 0;
		for(int i =0;i<water.length;i++)
		{
			res = res + (Math.min(maxL[i],maxR[i])-water[i]);
		}
		return res;
	}
	static void  printArr(String str, int[] arr)
	{
		System.out.print(str +" ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " | ");
		}
		System.out.println("");
	}
}
