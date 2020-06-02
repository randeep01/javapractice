// 3 4 6 1 2
public class Search{
	public static void main(String args[])
	{
		int [] arr = {3,4,5,6,0,1,2};
		int k = 3;
		System.out.println(search(arr,k));

	}
	public static  int search(int [] arr,int k )
	{
		int pivot = searchPivot(arr);
		System.out.println("Pivot is at idex"+ pivot);

		if(arr[pivot] == k)
			return pivot;
		else if(k>=arr[pivot] && k<=arr[arr.length-1]){
			System.out.println("initiating search on " + pivot + "," + (arr.length-1));
			return bs(arr,pivot,arr.length-1,k);
		}
		else{
			System.out.println("initiating search on: 0, " + pivot);
			return bs(arr,0,pivot,k);
		}
	}
	public static int bs(int arr[],int l, int h, int k)
	{
		System.out.println("Searching in: "+ l +","+h);
		if(l>h) return -1;
		int m = l + (h-l)/2;
		if(arr[m] == k)
			return m;
		else if(arr[m] > k)
			return bs(arr,l,m-1,k);
		else
			return bs(arr,m+1,h,k);
	}
	public static  int searchPivot(int arr[])
	{
		if(arr[0] < arr[arr.length-1]){
			return 0;
		}
		int l = 0;
		int h = arr.length-1;
		int m = 0;
		while(l<h)
		{
			m =	l + (h-l)/2;
			if(arr[m] > arr[h]){
				l = m +1;
			}
			else{
				h = m;
			}
		}
		return l;
	}
}
